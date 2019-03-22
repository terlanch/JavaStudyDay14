package cn.tedu.api;

import java.util.Scanner;

public class ObjectDemo02 {
	public static void main(String[] args) {
	/*	Object o1 = new Object();
		//哈希码是哈希散列算法计算出来的一个随机散落的结果
		//哈希码的值是随机散落在int的大概43亿的范围内
		//人为认为两次哈希码相同的概率为零
		//所以认为哈希码是唯一的
		//可以用来表示对象的内存地址
		System.out.println(o1.hashCode());
		System.out.println(o1.toString());
		System.out.println(o1);
		
		Object o2 = new Object();
		Object o3 = new Object();
		//判断两个对象的地址值是否相等
		System.out.println(o2.equals(o3));*/
		Person p = new Person();
		p.name = "迪丽热巴";
		p.age = 50;
		Person p1 = new Person();
		p1.name = "古力娜扎";
		p1.age  = 48;
		
		
	}
}
class Person {
	String name;
	int age;
	//需求 判断地址值和属性值  对equals（）方法进行重写
	@Override
	public boolean equals(Object obj) {
		//判断地址值是否相同
		if (this == obj){
			return true;
		}
		//排除参数是null的情况
		if (obj == null){
			return false;
		}
		//因为要比较属性  排数参数类型不匹配的情况
		if(this.getClass() != obj.getClass()){
			return false;
		}
		//判断属性值是否相同
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



