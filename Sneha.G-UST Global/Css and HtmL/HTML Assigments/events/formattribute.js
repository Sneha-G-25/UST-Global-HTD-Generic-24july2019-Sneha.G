bunny = document.createElement('form');
bunny1 = document.createElement('label')
bunny1.textContent = 'Name';
what1 = document.createElement('br')
boss = document.createElement('input')
break1 = document.createElement('br');
boss.setAttribute("type","text");
bunny.appendChild(bunny1)
bunny.appendChild(what1);
bunny.appendChild(boss)
bunny.appendChild(break1);
document.body.appendChild(bunny)

boss1 = document.createElement('label')
boss1.textContent = 'Password';
what2 = document.createElement('br');

boss2 = document.createElement('input');
boss2.setAttribute("type","password");
what = document.createElement('br');
bunny.appendChild(boss1);
bunny.appendChild(what2);
bunny.appendChild(boss2);
bunny.appendChild(what);

pass = document.createElement('label');
pass.textContent ='Age';
pass1 = document.createElement('input')
pass1.setAttribute("type","text");
what3 =document.createElement('br');
bunny.appendChild(pass);
bunny.appendChild(what3);
bunny.appendChild(pass1);
