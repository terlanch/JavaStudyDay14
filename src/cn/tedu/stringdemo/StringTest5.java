package cn.tedu.stringdemo;

import java.util.Scanner;

/*
 * ��ϰ������һ���ַ�����ͳ���ַ��ظ����ֵĴ���
 */
public class StringTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//����һ���������飬���ڱ��
		
		boolean[] bs = new boolean[str.length()];
		for(int i = 0;i < bs.length;i++){
			//����б��
			if(bs[i]){
				continue;
			}
			//����
			int count = 0;
			//��������ܹ�ִ�е���
			//����iλ�õ��ַ���û�б����
			char c = str.charAt(i);
			for(int j = i;j < str.length();j++)
				if(c == str.charAt(j)){
					count++;
					bs[j] = true;
				}
		System.out.println(c+"���ֵĴ�����"+count);
		
		}
		
		
	}
}
