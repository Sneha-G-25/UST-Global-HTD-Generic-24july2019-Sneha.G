function getArray(items) {
    return new Array().concat(items);
}
var strArray = getArray([576576, 79809, 79879]); //genric is string the data in array should be as declared
var x = strArray.push(7678);
console.log(x);
//MODULES
var MathOperations;
(function (MathOperations) {
    var Circle;
    (function (Circle) {
        var PI = 3.14;
        function circumferenceOfCircle(radius) {
            console.log("the circumference is" + PI * radius);
        }
        Circle.circumferenceOfCircle = circumferenceOfCircle;
    })(Circle = MathOperations.Circle || (MathOperations.Circle = {}));
})(MathOperations || (MathOperations = {}));
