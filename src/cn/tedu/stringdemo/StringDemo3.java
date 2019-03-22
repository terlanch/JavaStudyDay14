package cn.tedu.stringdemo;

public class StringDemo3 {
	public static void main(String[] args) {
		String str = "abcde";
		//将参数的字符串拼接后返回一个新的字符串
		System.out.println(str.concat("ert"));//abcdeert
		
		//判断字符串中是否包含参数这个子串
		System.out.println(str.contains("abc"));//true
		
		//判断是否是以参数的字符串结尾
		//一般用于判断文件的后缀
		System.out.println(str.endsWith("de"));//true
		//以...开头 
		//一般用于判断路径和网页
		System.out.println(str.startsWith("ab"));//true
		//判断字符串是否相等
		//先比较地址，再比较长度，再逐位比较
		System.out.println(str.equals("abcde"));//true
	}
}
