var addValue = function (val) {
    if (val === void 0) { val = 5; }
    console.log(val);
};
addValue();
addValue(25);
var names = ["Mohnish", "Axel", "Kai"];
var userFriends = function (username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log(username);
    for (var _a = 0, friends_1 = friends; _a < friends_1.length; _a++) {
        var friend = friends_1[_a];
        console.log(friend);
    }
};
var username = "Mohnish";
userFriends(username, names);
var printCapitalName = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var _a = 0, names_1 = names; _a < names_1.length; _a++) {
        var name_1 = names_1[_a];
        console.log(name_1.toUpperCase());
    }
};
printCapitalName.apply(void 0, names);
