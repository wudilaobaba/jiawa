import React,{
  Component,
  Fragment
} from "react"
import {BASEURL,GETHEADERS,POSTHEADERS} from '../api'
import {getReq,postReq} from 'network-request-bywhj'
import {transferDatas} from 'js-fun-bywhj'
class TestUpDate extends Component{
  constructor(props,context){
    super(props,context)
  }
  render(){
    return (
      <button onClick={this.test.bind(this)}>测试update</button>
    )
  }
  test() {
    getReq(transferDatas(`${BASEURL}/update`, {name:12,psw:111}, 'get'), GETHEADERS, (responseData) => {
      console.log(this.state);
    })
  }
}
export default TestUpDate;
