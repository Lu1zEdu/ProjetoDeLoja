const express = require('express');
const process = require("node:process");
const PORT = process.env.PORT || 3000;
const app =express();

app.get("/", (req, res) => {
    res.send('Olá, Express com Node.js!');
  });