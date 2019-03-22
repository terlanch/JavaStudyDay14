package cn.tedu.stringdemo;

import java.util.Scanner;

/*
 * 练习：输入一个字符串，统计字符重复出现的次数
 */
public class StringTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//创建一个布尔数组，用于标记
		
		boolean[] bs = new boolean[str.length()];
		for(int i = 0;i < bs.length;i++){
			//如果有标记
			if(bs[i]){
				continue;
			}
			//计数
			int count = 0;
			//代码如果能够执行到这
			//代表i位置的字符还没有被标记
			char c = str.charAt(i);
			for(int j = i;j < str.length();j++)
				if(c == str.charAt(j)){
					count++;
					bs[j] = true;
				}
		System.out.println(c+"出现的次数是"+count);
		
		}
		
		
	}
}
