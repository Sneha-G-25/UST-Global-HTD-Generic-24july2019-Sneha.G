///<reference path="./app1.ts"/>
MathOperations.Circle.circumferenceOfCircle(343);
// let Name="abc";
// console.log(Name);
// let Company;
// Company = 'ust';
// console.log(Company);
// Company = 'ust';
// console.log(Company);
// let sample:string | Number;
// sample='sneha';
// console.log(sample)
// let myArray=['ddd',3,true];//taking internally as any
// console.log(myArray);
// let aa:string[]=['jjj','jjjj','jjjjj'];//stricly declared array in sting
// console.log(aa);
// let mytuple:[string,boolean,number]=['ggg',true,6];
// console.log(mytuple)//data type should be declared in same as declared in tuple
// enum colour{
//     red,blue,black,brown// gives the index value
// }
// console.log(colour.blue);
//     enum Number{   //incriments the value incriments automatically
//     a=1,
//     b,
//     c
// }
// console.log(Number.b); 
// enum value{         //enum for string is to display the string value
//     a='ddd',
//     b='ggg',
//     c='hhhh',
// }
// console.log(value.b);
// class Person {
//     name : string = 'sneha';
//     age : number;
//     constructor(public name1:string,public age1:number){   //initializing variables of class,we can also give access spicifiers to variables
//         // this.name = name;
//         // this.age  = age;      
//     }
// }
// let person1 = new Person('raja',23);//creating the object and giving value to constructor
//   console.log (person1.name1);//to get the value from class
//   let usn1=23444444; //"strictNullChecks": false, ;nullabled type
//   usn1 = null;
//   console.log(usn1);
//   class Car{              //starting letter  of clss name should be capital
//        brand :string ='Audi';
// static model : number = 3434; 
//   }
//   let Audicar = new Car();
//  console.log (Audicar.brand);  //to accses no static members we have to create object
//  console.log(Car.model);
//  class Super{
//      constructor(public spider: string, public bat :string){
//      }
//  }
//  let superman = new Super("strong","speed")
//  console.log(superman.spider);
//  let benzcar : Car={
//      brand:'hhh',
//   static model:666
//  }
//  console.log(benzcar.model);
//                   //INHERITANCE
//  class Mobile{
//      constructor(public name:string,public num:number){ }
// }
// class Brand extends Mobile {
//     constructor(public colour:string, public RAM :string, public MYname:string, public num:number ){
//         super(MYname,num)
//      }  
// }
// let Comp1 = new Mobile("intex",67676)
// let Comp = new Brand("red","yyyy","samsung",67676)
// console.log(Comp.MYname);    //by using sub class object we access  super class properties not values
// console.log(Comp.num);
// class Fruites {
//     constructor(public name:string,public colour: string){}
// }
// let fruites1: Fruites = {
//     name : "chiku",
//     colour :'red'
// }
// console.log(Fruites.name);
// //TO CREATE OPTIONAL FIELS IN FORMS
// class Form{
//     constructor(public name:string,public age:number,public degree ?:string){}
// }
// let form1: Form ={
//     name :"jkjkj",
//     age :66
// }
// let form2 : Form = {
//     name :"hghg",
//     degree : "gjgjg",
// }
// //INTERFACE
// interface Student{
//     name:string;
//     age:number;
//     GetDetails():void   //we have to pass the terurn type
// }
// class School implements Student{
//            name = "sneha";
//            age  = 67;
//            GetDetails(){
//                console.log("name is " + this.name + "age is"+ this.age);
//            }
// }
// let School1 = new School()
// School1.GetDetails();
// let student2 : new Student ={
//     name :"ddddd",
//     age : 23,
//     GetDetails:() =>{
//     console.log("name is" + student2.name + "age is" + student2.age);
//     }
// }
