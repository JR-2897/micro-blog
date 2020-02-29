const jwt = require('jsonwebtoken');
const config = require('../configs/jwt.config');

function verifyToken(req, res, next){

	let token = req.headers['token'];
	if(!token){
		return res.status(400).send({
			admin: false,
			message: "missing token"
		})
	}
	
module.exports = verifyToken;