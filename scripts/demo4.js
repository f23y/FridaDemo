rpc.exports = {
    add: function (a, b) {
        return a + b;
    },
    sub: function (a, b) {
        return new Promise(function (resolve) {
        setTimeout(function () {
            resolve(a - b);
        }, 100);
        });
    },
    hack: function() {
        return 'you are hacked'
    }
};
