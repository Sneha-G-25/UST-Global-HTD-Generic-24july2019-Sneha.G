newTable= document.createElement('table');
newTable.setAttribute("border","2px")
// newTable.setAttribute("border-colaps","1px")
 newrow1 = document.createElement('tr')
 tr1d1 = document.createElement('td')
tr1d1.textContent = 'Name';
tr1d2 = document.createElement('td');
tr1d2.textContent = 'age';
newrow1.appendChild(tr1d1);
newrow1.appendChild(tr1d2);
newTable.appendChild(newrow1);
document.body.appendChild(newTable);
newrow2 = document.createElement('tr');
 tr2d1 = document.createElement('td')
 tr2d1.textContent = 'sneha';
  tr2d2 = document.createElement('td');
  tr2d2.textContent ='22';
  newrow2.appendChild(tr2d1);
  newrow2.appendChild(tr2d2);
  newTable.appendChild(newrow2);
 document.body.appendChild(newTable);//my practise 