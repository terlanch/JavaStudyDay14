package cn.tedu.stringdemo;

import java.util.Scanner;

public class StringTest3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.nextLine();
		//���ַ���תΪ�ַ�����		
		char[] chs = str.toCharArray();
		int sum =0;
		//�������ֳ��ֵĴ���
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
