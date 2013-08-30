package com.phonegap.plugins.appversion;

import org.json.JSONArray;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

public class AppVersion extends CordovaPlugin {

    public final String ACTION_GET_VERSION_NUMBER = "getVersionNumber";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        boolean result = false;
        PackageManager packageManager = this.cordova.getActivity().getPackageManager();
        if(action.equals(ACTION_GET_VERSION_NUMBER)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.cordova.getActivity().getPackageName(), 0);
                result = true;
                callbackContext.success(packageInfo.versionName);
            }
            catch (NameNotFoundException exception) {
                result = false;
                callbackContext.success(exception.getMessage());
            }
        }

        return result;
    }
}