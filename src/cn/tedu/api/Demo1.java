package cn.tedu.api;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		String str = "abcde";
		//�ж��Ƿ�����������򷵻ص�һ�γ��ָ��ַ������������������򷵻�-1
		int index = str.indexOf("cde")+1;
	
		System.out.println(index);
		//�ж��Ƿ����ָ���ַ�������������true������������false
		boolean b2 = str.contains("ccd");
		System.out.println(b2);
		//���ַ���ת���ַ�����
		char[] chs = str.toCharArray();
		System.out.println(Arrays.toString(chs));
		//���ַ���ת���ַ�������
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
	}

}
