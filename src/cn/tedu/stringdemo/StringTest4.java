package cn.tedu.stringdemo;

import java.util.Scanner;

public class StringTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0;i<126;i++){
			
			int s = 0;
			
			for(int j = 0;j < str.length();j++){
				
					if(str.charAt(j) == i){
					s++;
					}
					
				}
			char b = (char)i;
			if(s != 0){
			System.out.println(b+"出现了"+s+"次");
			}
			
			}
		}
		
	}


