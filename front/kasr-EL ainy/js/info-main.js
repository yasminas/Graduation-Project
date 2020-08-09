
// to open text area in case of radio//
 function show() { document.getElementById('Specify-working').style.display = 'block'; }
 function hide() { document.getElementById('Specify-working').style.display = 'none'; }






// to open textarea in case of selection box //
 function showhide(){ (document.getElementById('Past-History').value);
if(document.getElementById('Past-History').value == 'Other'){
document.getElementById('Specify-Other').style.display = 'block';
}
else{
document.getElementById('Specify-Other').style.display = 'none';
}
}


function go(){
 if(document.getElementById('Female').checked){location.href='Females.html';}
 else if(document.getElementById('Male').checked){location.href='Seizure-info.html';}

 }


 