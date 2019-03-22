package cn.tedu.api;

public class Demo5 {
	public static void main(String[] args) {
		/*String str = "HelloWorld";
		String str1 = str.substring(6, 10);//截取6-10位
		System.out.println(str1);//输出结果为word
	    //如果只传入一个参数的话会截取该参数之后的全部内容
*/
		//字符串拼接
		/*String str = "He".concat("ll").concat("o");
		System.out.println(str);//输出Hello
*/  	
		//单字符查找.indexOf()；从左开始查找，没有该字符返回-1
		//.lastIndexOf()；从尾部开始查找  但计数还是从头开始
		/*String str = new String("I am a good student");
		int a = str.indexOf('a');
		int b = str.indexOf("good");
		int c = str.indexOf("w",2);
		
		int d = str.lastIndexOf('a');
		int e = str.lastIndexOf("a", 3);
		
		System.out.println(a);//2 空格也是字符
		System.out.println(b);//7 只能查找单字符
		System.out.println(c);//-1 没有的返回-1
		System.out.println(d);//5 从尾部开始找
		System.out.println(e);//2*/
		
		
		//将字符串大小写转换
		//.toLowerCase();将字符全转换小写字符
		//.toUpperCase();将字符全转换大写字符
		String str = "Hello World";
		String str1 = str.toLowerCase();
		String str2 = str.toUpperCase();
		
		System.out.println(str1);//hello world
		System.out.println(str2);//HELLO WORLD
	}
}