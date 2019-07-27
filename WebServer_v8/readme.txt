本版本改动：
使服务端支持处理业务操作：完成注册业务
1.在webapp/myweb下创建react项目loginwhj
2.当页面上的form表单以GET形式提交时，表单中用户输入的内容会拼接到地址栏url里。所以服务端在解析请求时获取请求行中url部分时，可能会得到两种情况的内容：
	1.不含有参数的，如：/myweb/index.html
	2.含有参数的，如：/myweb/reg?username=fan&password=xx
	因此我们要重构HttpRequest这个类的解析工作，对请求行中url部分要进行进一步解析工作
		2.1在HttpRequest中添加三个新的属性，用于保存url中的各部分内容。
		requestURI:保存请求部分
		queryString:保存参数部分
		Map parameters:保存每个参数(通过解析queryString得到)
		