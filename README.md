#Phonegap-app-version
Phonegap / Cordova plugin to get the application version number

## How to install
```
cordova plugin add https://github.com/Matsiya/phonegap-app-version.git
```

## Usage

```
window.appversion.getVersionNumber(function(versionNumber) {
	console.log( versionNumber );
});
```

Note: The android version returns the android:versionName value of AndroidManifest.xml

## Platforms

IOS and Android, windows Phone will be supported later.


## Thanks

This plugin is an aggregation of others code : 

Android : https://github.com/gcatalfamo/Version/blob/master/1.0/www/version.js

iOS : a stackoverflow post by CWSpear at http://stackoverflow.com/questions/11550705/how-to-get-the-application-version-and-build-in-an-ios-phonegap-application