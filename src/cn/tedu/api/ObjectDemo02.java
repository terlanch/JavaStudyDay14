package cn.tedu.api;

import java.util.Scanner;

public class ObjectDemo02 {
	public static void main(String[] args) {
	/*	Object o1 = new Object();
		//��ϣ���ǹ�ϣɢ���㷨���������һ�����ɢ��Ľ��
		//��ϣ���ֵ�����ɢ����int�Ĵ��43�ڵķ�Χ��
		//��Ϊ��Ϊ���ι�ϣ����ͬ�ĸ���Ϊ��
		//������Ϊ��ϣ����Ψһ��
		//����������ʾ������ڴ��ַ
		System.out.println(o1.hashCode());
		System.out.println(o1.toString());
		System.out.println(o1);
		
		Object o2 = new Object();
		Object o3 = new Object();
		//�ж���������ĵ�ֵַ�Ƿ����
		System.out.println(o2.equals(o3));*/
		Person p = new Person();
		p.name = "�����Ȱ�";
		p.age = 50;
		Person p1 = new Person();
		p1.name = "��������";
		p1.age  = 48;
		
		
	}
}
class Person {
	String name;
	int age;
	//���� �жϵ�ֵַ������ֵ  ��equals��������������д
	@Override
	public boolean equals(Object obj) {
		//�жϵ�ֵַ�Ƿ���ͬ
		if (this == obj){
			return true;
		}
		//�ų�������null�����
		if (obj == null){
			return false;
		}
		//��ΪҪ�Ƚ�����  �����������Ͳ�ƥ������
		if(this.getClass() != obj.getClass()){
			return false;
		}
		//�ж�����ֵ�Ƿ���ͬ
		Person p =(Person) obj;
		if(this.age != p.age){
			return false;
		}
		if(this.name == null){
			if(p.name != null){
				return false;
			}
		}else if(!this.name.equals(p.name)){
			return false;
		}
		return true;
	}
}



