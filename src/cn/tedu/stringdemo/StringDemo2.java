package cn.tedu.stringdemo;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "a"+"b";//�ڱ���׶ξͱ���ˡ�ab��
		String s3 = "a";
		s3 += "b";
		new StringBuilder().append("").toString();
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
	}
}
