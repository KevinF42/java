//binary random Integer
//save file as randomIntCreate.js
//run node randomInCreate.js
var randomInteger = function (){
	var ival = Math.random()*256;
	//console.log(ival);
	ival = Math.floor(ival);
	return ival;
}
// main

var rInt ;
var i;
for (i = 0; i < 65536; i++){
rInt = randomInteger();
//console.log(rInt+ ",");
process.stdout.write(rInt+",");
}