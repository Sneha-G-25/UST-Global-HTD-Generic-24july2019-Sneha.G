let data = new Array();
data[0] ='jjjj';
data[1] = 'sss';
console.log(data);
let data1 = new Array();
data1[0] = 'gggg';
data1[1] = 'ffff';
console.log(data1);
let data2 = new Array();
data2[0] = 'oooo';
data2[1] = 'uuuu';
let data3 = new Array();
data3[0] = 7;
data3[1] = 4;
let data4 = new Array();
data4[0] = 'help';
data4[1] = 7;

// creating arrays without using new keyword

let work =[    {
                 name:'ssss',
                 place:'ddd'},

                {
                    place:'ghhh',
                    ghhj:6
                }]

console.log(data1[0]);
console.log(data1[0].name);

let places = ['mysore','banglore','kurg']
let fruites =['grapes','pomogranet','danana']
let numbers = [1,2,3,4];
let alpha =['s','g','h','h'];

work.forEach(function(x){
console.log(x);
})


for(let i=0;i<fruites.length;i++){
    console.log(fruites[i]);
}