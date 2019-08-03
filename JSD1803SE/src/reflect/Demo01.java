package reflect;
/**
 * java反射机制  运行期间才生成类以及类的实例
 * 反射机制允许我们对一个类的加载，实例化，调用方法操作属性从编码期改为在运行期进行。这大大的提高了代码的灵活度。
 * 但是运行期进行反射操作会消耗额外的资源与性能。所以要适度使用
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//JVM首先会加载Person.class文件
//		Person02 p = new Person02();
		
		//第二种加载类的方式
		try {
			Class c = Class.forName("reflect.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/**
		 * JVM加载一个类有以下几种方式：
		 * 1.执行代码时，发现需要用到某个类时
		 * 	如：Person p = new Person()
		 *  这时候JVM会加载Person.class
		 *  
		 * 2.通过反射机制中的：
		 * 	Class.forName(String className)方法以字符串的形式告知JVM加载指定的类
		 * 	此方法只能寻找环境变量中配置的类路径中指定的类
		 * 
		 * 3.通过类加载器ClassLoader来加载指定的类，类加载器可以额外指定环境变量中没有指定的类路径。
		 * 	并从中寻找指定的类进行加载。
		 * 
		 * 除第一种方式外，剩下两种都是基于反射机制动态加载一个类
		 * 
		 *
		 */
		
		
	}
}
