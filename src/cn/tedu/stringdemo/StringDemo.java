package cn.tedu.stringdemo;
/*
 * String��
 * 
 * String�Ǹ������࣬���ܱ��̳�
 * 
 * �ַ����ǳ������Ǳ�������
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		//�Ƚϵ�ַ
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
	}
}