package cn.tedu.stringdemo;

import java.util.Arrays;

public class StringPractice {
	public static void main(String[] args) {
		//['a','b','c']
		//��ȡָ�����������ַ�Ԫ��
		System.out.println("abc".charAt(2));
		//��ȡ����
		System.out.println("sbdiua".length());
		//���ַ���ת��Ϊ�ַ�����
		String str = "asdadsa";
		char[] chs = str.toCharArray();
		System.out.println(Arrays.toString(chs));
		//���ַ�����ת��Ϊ�ַ���
		String str1 = new String(chs);
		System.out.println(str1);
		//�ַ����� �����ַ��������һ��������ʼ��ȡ����ȡ�ĸ���
		//String(char[] value,int offset,int count)
		String str2 = new String(chs,1,3);
		System.out.println(str2);
	}
}
