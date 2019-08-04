import React from 'react';
import Login from "./page/Login.js"
import DengLu from "./page/DengLu.js"
import TestUpDate from "./page/TestUpDate.js"

function App() {
  return (
    <div>
      <h1>注册</h1>
      <Login/>
      <br/><br/><br/><br/><br/>
      <h1>登陆</h1>
      <DengLu/>
      <br/><br/><br/><br/><br/>
      <h1>测试Update</h1>
      <TestUpDate/>
    </div>
  );
}

export default App;
