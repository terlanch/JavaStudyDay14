package cn.tedu.stringdemo;

public class StringDemo3 {
	public static void main(String[] args) {
		String str = "abcde";
		//���������ַ���ƴ�Ӻ󷵻�һ���µ��ַ���
		System.out.println(str.concat("ert"));//abcdeert
		
		//�ж��ַ������Ƿ������������Ӵ�
		System.out.println(str.contains("abc"));//true
		
		//�ж��Ƿ����Բ������ַ�����β
		//һ�������ж��ļ��ĺ�׺
		System.out.println(str.endsWith("de"));//true
		//��...��ͷ 
		//һ�������ж�·������ҳ
		System.out.println(str.startsWith("ab"));//true
		//�ж��ַ����Ƿ����
		//�ȱȽϵ�ַ���ٱȽϳ��ȣ�����λ�Ƚ�
		System.out.println(str.equals("abcde"));//true
	}
}
