 
 //ordered list
 order = document.createElement('table');
 order1 = document.createElement('ol')
 one = document.createElement('li');
one.textContent = "orange";
two = document.createElement('li')
two.textContent = "apple";
three= document.createElement('li')
three.textContent = "pineapple";
order1.appendChild(one);
order1.appendChild(two);
order1.appendChild(three);
order.appendChild(order1)
document.body.appendChild(order);
