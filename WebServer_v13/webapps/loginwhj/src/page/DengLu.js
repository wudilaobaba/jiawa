import React ,{
  Component,
  Fragment
} from "react"
import {BASEURL,GETHEADERS,POSTHEADERS} from '../api'
import {getReq,postReq} from 'network-request-bywhj'
import {transferDatas} from 'js-fun-bywhj'
class DengLu extends Component{
  constructor(props,context){
    super(props,context)
    this.state = {
      userName:"",
      psw:""
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
  get() {
    getReq(transferDatas(`${BASEURL}/denglu`, this.state, 'get'), GETHEADERS, (responseData) => {
      console.log(this.state);
    })
  }
  post(){
    postReq(`${BASEURL}/denglu`, POSTHEADERS, transferDatas('', this.state, 'get').split('?')[1], (responseData) => {
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
        <br/>
        <button onClick={this.post.bind(this)}>登录</button>
      </Fragment>
    )
  }
}
export default DengLu;
