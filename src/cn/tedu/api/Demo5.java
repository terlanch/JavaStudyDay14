package cn.tedu.api;

public class Demo5 {
	public static void main(String[] args) {
		/*String str = "HelloWorld";
		String str1 = str.substring(6, 10);//��ȡ6-10λ
		System.out.println(str1);//������Ϊword
	    //���ֻ����һ�������Ļ����ȡ�ò���֮���ȫ������
*/
		//�ַ���ƴ��
		/*String str = "He".concat("ll").concat("o");
		System.out.println(str);//���Hello
*/  	
		//���ַ�����.indexOf()������ʼ���ң�û�и��ַ�����-1
		//.lastIndexOf()����β����ʼ����  ���������Ǵ�ͷ��ʼ
		/*String str = new String("I am a good student");
		int a = str.indexOf('a');
		int b = str.indexOf("good");
		int c = str.indexOf("w",2);
		
		int d = str.lastIndexOf('a');
		int e = str.lastIndexOf("a", 3);
		
		System.out.println(a);//2 �ո�Ҳ���ַ�
		System.out.println(b);//7 ֻ�ܲ��ҵ��ַ�
		System.out.println(c);//-1 û�еķ���-1
		System.out.println(d);//5 ��β����ʼ��
		System.out.println(e);//2*/
		
		
		//���ַ�����Сдת��
		//.toLowerCase();���ַ�ȫת��Сд�ַ�
		//.toUpperCase();���ַ�ȫת����д�ַ�
		String str = "Hello World";
		String str1 = str.toLowerCase();
		String str2 = str.toUpperCase();
		
		System.out.println(str1);//hello world
		System.out.println(str2);//HELLO WORLD
	}
}