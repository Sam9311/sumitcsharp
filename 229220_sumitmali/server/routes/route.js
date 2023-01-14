const express=require('express');
//const { rmSync } = require('fs');
//var app =express();
const db=require('../db')
const router=express.Router();





router.get('/display',(req,res)=>{
    const query=`select * from trainer;`;
    db.query(query,(err,result)=>{
        if(err){
            res.send("no data is there!!!")
        }
        console.log("success"+result);
        //res.send("success");
            res.send(result);
        })
    })


    //
    //| tid | name  | address | gender | skill | qualification | doj        |
    router.post('/insert',(req,res)=>{
        
        const {name,address,gender,skill,qualification,doj}=req.body
        const query=`insert into trainer (name,address,gender,skill,qualification,doj) values('${name}','${address}','${gender}','${skill}','${qualification}','${doj}');`;
        console.log(req.body)
        db.query(query,(err,result)=>{
            if(err){
                res.send("error is coming!!!")
            }
            console.log("success"+result);
            //res.send("success");
                res.send(result);
            })
        })
        router.get('/',(req,res)=>{
            res.send("this is success!")
        })

module.exports=router;