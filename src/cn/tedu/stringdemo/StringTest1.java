package cn.tedu.stringdemo;

import java.util.Scanner;

public class StringTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//String str = "1e1uy2eiube1";
		char[] chs = str.toCharArray();
		//计算大写字母的个数
		int d = 0;
		//计算小写字母的个数
		int x = 0;
		//计算数字的个数
		int s = 0;
		//计算其他字符的个数
		int q = 0;		
				
		for(int i = 0;i< chs.length;i++){
			if(chs[i] >= 65 && chs[i] <= 90){
				d++;
			}else if(chs[i] >= 97 && chs[i] <= 122){
				x++;
			}else if(chs[i] >= 48 && chs[i] <= 57){
				s++;
			}else{
				q++;
			}
		}
		System.out.println("大写字母的个数："+d+",小写字母的个数："+x+",数字的个数："+s+",其他字符的个数："+q);
	}
}
