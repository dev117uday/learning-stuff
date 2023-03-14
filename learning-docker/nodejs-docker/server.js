var express = require('express');
var app = express();

app.get('/', function (request, response) {
  console.log(`${request.path} accessed`);
  response.json({
    "message" : "Hello World from Docker !!"
  })
});

var server = app.listen(process.env.PORT, function () {
  var port = server.address().port;
  console.log('App Listening at port : %s ', port);
});