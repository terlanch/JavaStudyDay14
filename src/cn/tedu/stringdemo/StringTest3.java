package cn.tedu.stringdemo;

import java.util.Scanner;

public class StringTest3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符：");
		String str = sc.nextLine();
		//将字符串转为字符数组		
		char[] chs = str.toCharArray();
		int sum =0;
		//计算数字出现的次数
		int c = 0;
		for(int i = 0;i<chs.length;i++){
			if(chs[i]>=48&&chs[i]<=57){
				sum =sum+chs[i];
				c++;
			}
		}
		System.out.println((sum-c*48));
	}
}
