
var exec = require("cordova/exec");

var AppVersion = function () {
    this.name = "AppVersion";
};


AppVersion.prototype.getVersionNumber = function (successCallback, failureCallback) {
    exec(successCallback, failureCallback, "AppVersion", "getVersionNumber", []);
};

module.exports = new AppVersion();
