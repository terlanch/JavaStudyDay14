package cn.tedu.api;
/*
 * Cloneable�ӿ�����û������
 * toString() Ĭ���������ʮ�����Ƶĵ�ֵַ
 * hashCode() ���ص��ǹ�ϣ��ֵ
 * getClass() ���ص��Ƕ����ʵ������
 * equals() �Ƚ϶���ĵ�ֵַ�Ƿ����
 */
public class ObjectDemo implements Cloneable{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectDemo od = new ObjectDemo();
		
		//��ֵ
		od.i = 10;
		//clone���� ������һ���µĶ��󣬺�ԭ�еĶ����ַ��ͬ����������ͬ
		ObjectDemo o1 = (ObjectDemo)od.clone();
		System.out.println(o1.i);//10
		System.out.println(o1);//ObjectDemo@15db9742
		System.out.println(od);//ObjectDemo@6d06d69c
		
		
		System.out.println("abc".getClass());//class java.lang.String
		Object o2 = "abc";
		//��ȡ����ʵ�����͵���
		System.out.println(o2.getClass());//class java.lang.String
	}
}
