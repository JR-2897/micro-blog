const express = require('express');
const config = require('../configs/server.config');
const bodyParser = require('body-parser');
const apiRouter = require('.../routes');
const cors = require('cors');


const app = express();

app.use(express.urlencoded({extented:tru}));
app.use(express.json());
app.use(function(req,res,next){
	res.setHeader("Content-type","application/json");
	res.setHeader('Accept','application/json');
	res.setHeader('Access-Control-Allow-Origin', 'http://localhost:8080');
	res.setHeader('Access-Control-Allow-Methods','GET, POST, PATCH, PUT, DELETE, OPTIONS');
	res.setHeader('Access-Control-Allow-Headers','Origin, Accept, Content-Type, Authorization, Access-Control-Allow-Origin');
	next();
});



app.use(bodyParser.json());
app.use(cors());

app.use('/api/v1', apiRouter);

exports.start = () => {
	let port = config.port;
	app.listen(port,(err)=>{
		if(err){

			console.log(`Error:${err`);
			console.log('Error',port);
			console.log('Error'.err);

			process.exit(-1);
		}
		console.log(`app is runnig on port ${port}`);
	});
}

