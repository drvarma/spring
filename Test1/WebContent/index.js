var express = require('express'); // gets the dependencies

var app = express(); //creating a var to use express method/module so that you can use that again in our program

app.get('/', function(req,res){
	res.send([   
  {"name": "Afghanistan", "code": "AF"}, 
  {"name": "Åland Islands", "code": "AX"}, 
]);

});

var server = app.listen(3000,function(){
	console.log("running server");
	
});