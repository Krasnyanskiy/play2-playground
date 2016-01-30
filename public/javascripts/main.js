$(document).ready(function () {

    // desc_ord

    var array = _.sortBy([8, 2, 1, 2, 5, 4, 7, 0, -1], function (n) {
        return -n;
    });

    _.each(array, function (el) {
        console.log(el)
    });

});