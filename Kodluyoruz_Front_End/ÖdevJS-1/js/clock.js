

let name = prompt("İsminiz");

document.querySelector('#myName').innerText = name;


var span = document.getElementById('myClock');

let days = ["Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"]




function time() {
  var d = new Date();
  var s = d.getSeconds();
  var m = d.getMinutes();
  var h = d.getHours();
  let day = days[(Number(d.getDay())) - 1];



  span.innerHTML = `${h}:${m}:${s} ${day}`;


};

setInterval(time, 1000);



