package cn.tedu.stringdemo;
/*
 * String类
 * 
 * String是个最终类，不能被继承
 * 
 * 字符串是常量，是被共享的
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		//比较地址
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
	}
}
