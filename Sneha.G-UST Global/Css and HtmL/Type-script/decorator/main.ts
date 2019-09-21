function printConstructor (cons:Function){
    console.log(cons);
}

@printConstructor    //experimental decorator tsc configjson

class Sample{
    constructor(){
        console.log("this is sample class constructor");

    }
}