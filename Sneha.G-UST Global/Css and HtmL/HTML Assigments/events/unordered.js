//un ordered list

list = document.createElement('table');
list1 = document.createElement('ul')
new1 = document.createElement('li')
new1.textContent = 'water';
new2 = document.createElement('li')
new2.textContent = 'air';
new3 = document.createElement('li')
new3.textContent ='soil';
list1.appendChild(new3);
list1.appendChild(new2);
list1.appendChild(new1);
list.appendChild(list1);
document.body.appendChild(list);
