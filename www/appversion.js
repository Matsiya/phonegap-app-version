
var exec = require("cordova/exec");

var AppVersion = function () {
    this.name = "AppVersion";
};


AppVersion.prototype.getVersionNumber = function (callback) {
    exec(null, null, "AppVersion", "getVersionNumber", [callback]);
};

module.exports = new AppVersion();
