const express=require('express');
var app =express();
const cors=require('cors');
const path=require('path');
const bodyparser=require('body-parser');
const routing=require('./routes/route')





app.use(express.json());
 app.use(cors('*'))
 app.use('/',routing);


app.listen(4000,()=>{
    console.log("app started at 4000")
})

module.exports=app;