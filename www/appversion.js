
var exec = require("cordova/exec");

var AppVersion = function () {
    this.name = "AppVersion";
};


AppVersion.prototype.send = function (callback) {
    exec(null, null, "AppVersion", "getVersionNumber", [callback]);
};

module.exports = new AppVersion();
