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