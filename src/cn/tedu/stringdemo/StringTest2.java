package cn.tedu.stringdemo;

import java.util.Scanner;

/*
 * 输入一个字符串，以及两个数字，按照输入的数字对字符串进行截取
 */
public class StringTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int begin = sc.nextInt();
		int end = sc.nextInt();
		
		if(begin <0 || begin > end || end > str.length()){
			System.out.println("别乱输入");
			return;
		}
		
		//将字符串转为字符数组
		char[] chs = str.toCharArray();
		//截取字符数组
		String str1 = new String(chs,begin,(end-begin));
		System.out.println(str1);
	}
}
