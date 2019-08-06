import React ,{
  Component,
  Fragment
} from "react"
import {BASEURL,GETHEADERS,POSTHEADERS} from '../api'
import {getReq,postReq} from 'network-request-bywhj'
import {transferDatas} from 'js-fun-bywhj'
class Login extends Component{
  constructor(props,context){
    super(props,context)
    this.state = {
      userName:"",
      psw:"",
      nickName:"",
      age:""
    }
  }
  changeUserName(e){
    this.setState({
      userName:e.target.value
    })
  }
  changeUserPsw(e){
    this.setState({
      psw:e.target.value
    })
  }
  changeUserNickName(e){
    this.setState({
      nickName:e.target.value
    })
  }
  changeUserAge(e){
    this.setState({
      age:e.target.value
    })
  }
  get() {
    getReq(transferDatas(`${BASEURL}/login`, this.state, 'get'), GETHEADERS, (responseData) => {
      console.log(this.state);
    })
  }
  post(){
    postReq(`${BASEURL}/login`, POSTHEADERS, transferDatas('', this.state, 'get').split('?')[1], (responseData) => {
      console.log(responseData);
    })
  }
  render(){
    return (
      <Fragment>
        <input
          type="text"
          placeholder="用户名"
          value={this.state.userName}
          onChange={this.changeUserName.bind(this)}
        />
        <br/>
        <input
          type="text"
          placeholder="密码"
          value={this.state.psw}
          onChange={this.changeUserPsw.bind(this)}
        />
        <br/>
        <input
          type="text"
          placeholder="昵称"
          value={this.state.nickName}
          onChange={this.changeUserNickName.bind(this)}
        />
        <br/>
        <input
          type="text"
          placeholder="年龄"
          value={this.state.age}
          onChange={this.changeUserAge.bind(this)}
        />
        <br/>
        <br/>
        <button onClick={this.post.bind(this)}>提交</button>
      </Fragment>
    )
  }
}
export default Login;
