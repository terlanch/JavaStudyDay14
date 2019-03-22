package cn.tedu.stringdemo;

import java.util.Arrays;

public class StringPractice {
	public static void main(String[] args) {
		//['a','b','c']
		//获取指定索引处的字符元素
		System.out.println("abc".charAt(2));
		//获取长度
		System.out.println("sbdiua".length());
		//将字符串转换为字符数组
		String str = "asdadsa";
		char[] chs = str.toCharArray();
		System.out.println(Arrays.toString(chs));
		//将字符数组转换为字符串
		String str1 = new String(chs);
		System.out.println(str1);
		//字符数组 ，从字符数组的拿一个索引开始截取，截取的个数
		//String(char[] value,int offset,int count)
		String str2 = new String(chs,1,3);
		System.out.println(str2);
	}
}
