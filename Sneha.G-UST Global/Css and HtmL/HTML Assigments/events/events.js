function getid()
{
    alert("wats up")
}
let found = document.getElementById('search');
found.onclick = function(){
    alert("yeepee");
}
let one = document.createElement('p');
one.textContent = "this is new element";
one.onclick = function()
{
    document.write('hi');
}
document.body.appendChild(one);