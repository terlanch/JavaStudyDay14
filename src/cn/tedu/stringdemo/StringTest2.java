package cn.tedu.stringdemo;

import java.util.Scanner;

/*
 * ����һ���ַ������Լ��������֣�������������ֶ��ַ������н�ȡ
 */
public class StringTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int begin = sc.nextInt();
		int end = sc.nextInt();
		
		if(begin <0 || begin > end || end > str.length()){
			System.out.println("��������");
			return;
		}
		
		//���ַ���תΪ�ַ�����
		char[] chs = str.toCharArray();
		//��ȡ�ַ�����
		String str1 = new String(chs,begin,(end-begin));
		System.out.println(str1);
	}
}
