function getArray<p>(items:p[]):p[]{
    return new Array<p>().concat(items);
}

let strArray = getArray<number>([576576,79809,79879])  //genric is string the data in array should be as declared
let x=strArray.push(7678);
console.log(x);

//MODULES

namespace MathOperations{
    export namespace Circle{
    const PI = 3.14;
    export function circumferenceOfCircle(radius:number){     //export is to link the cal operation
        console.log("the circumference is" + PI*radius);
    }
}
}



 