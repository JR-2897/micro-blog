const express = require('express');
const router = express.Router();
const admin = require('../controllers/admin.controller');

router.post('/admin/register', admin.create);

router.post('/admin/login', admin.login);

module.exports = router;