//node服务进行测试
const express = require('express')
let bodyParser = require('body-parser')
let app = express()
app.use((req, res, next) => {
  if (req.headers.origin == 'http://192.168.0.101:3000' || req.headers.origin == 'http://127.0.0.1:3000' || req.headers.origin == 'http://localhost:3000') {
    res.header('Access-Control-Allow-Origin', req.headers.origin);
    res.header('Access-Control-Allow-Headers', 'Content-Type, Content-Length, Authorization, Accept, X-Requested-With , yourHeaderFeild, X-Test-Cors');
    res.header('Access-Control-Allow-Methods', 'PUT, POST, GET, DELETE, OPTIONS');
    res.header('Access-Control-Allow-Credentials', 'true')
  }
  next()
})
app.use(bodyParser.urlencoded({
  extended: false
}))
app.post('/postData', (req, res) => {
  console.log(req.body);  //req.body为前端post过去的数据(name=Mike%age=12)，插件进行处理后转为object
  res.send(req.body)      // *** 此时req.body为object类型
})


app.get('/name', (req, res) => {
  res.send(req.query)
})
app.listen(8080)
