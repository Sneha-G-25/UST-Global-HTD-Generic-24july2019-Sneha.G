namespace RectOperations {      //we have class with same namespace
    export namespace rectangle{
        export function area(length: number,breadth :number){
            console.log("area is" +length*breadth)
        }
        export function permeter(length:number,breadth:number){
            console.log("this is perimeter" + 2*(length+breadth))
        }
    }
}