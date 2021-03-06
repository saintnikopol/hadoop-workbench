define(function (require) {
    "use strict";

    /* jshint ignore:start */

    require("flume/ngModule").value("generateUUID", generateUUID);

    function generateUUID() {
        var d = Date.now();
        var uuid = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
            var r = (d + Math.random() * 16) % 16 | 0;
            d = Math.floor(d / 16);
            return (c == 'x' ? r : (r & 0x3 | 0x8)).toString(16);
        });
        return uuid;
    }

    /* jshint ignore:end */

});