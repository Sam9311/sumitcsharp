const mysql =require('mysql2');

console.log("this is getting called...")
const pool=mysql.createPool({
    host:'localhost',
    user:'sumit',
    password:'root123',
    database:'sumit',
    waitForConnections:true,
    connectionLimit:10
})


module.exports=pool;