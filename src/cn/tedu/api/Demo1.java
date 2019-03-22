package cn.tedu.api;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		String str = "abcde";
		//判断是否包含，包含则返回第一次出现该字符串的索引，不包含则返回-1
		int index = str.indexOf("cde")+1;
	
		System.out.println(index);
		//判断是否包含指定字符串，包含返回true，不包含返回false
		boolean b2 = str.contains("ccd");
		System.out.println(b2);
		//将字符串转成字符数组
		char[] chs = str.toCharArray();
		System.out.println(Arrays.toString(chs));
		//将字符创转成字符节数组
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
	}

}
