package cn.tedu.stringdemo;
/*
 * compareto
 */
public class StringTest6 {
	public static void main(String[] args) {
		String str1 = "abcz";
		String str2 = "abcqweq";
		//�ַ����ײ�ʹ���ַ�����
		//compareTo����ʹ���ַ����������λ�Ƚ�
		//������Ȳ�ͬ������ǰ������ݶ���ͬ����ô���ص��ǳ���֮��
		//������ַ�����ͬ����ô���صľ����ַ�֮��
		//�����ȫ��ȣ���ô���س���֮��
		//�������ֵ��������������õĶ����
		//����Ǹ�����������������
		int i = str1.compareTo(str2);
		System.out.println(i);
	}
}
