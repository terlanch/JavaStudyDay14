package cn.tedu.api;
/*
 * Cloneable接口里面没有内容
 * toString() 默认输出的是十六进制的地址值
 * hashCode() 返回的是哈希码值
 * getClass() 返回的是对象的实际类型
 * equals() 比较对象的地址值是否相等
 */
public class ObjectDemo implements Cloneable{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectDemo od = new ObjectDemo();
		
		//赋值
		od.i = 10;
		//clone方法 拷贝出一个新的对象，和原有的对象地址不同，但属性相同
		ObjectDemo o1 = (ObjectDemo)od.clone();
		System.out.println(o1.i);//10
		System.out.println(o1);//ObjectDemo@15db9742
		System.out.println(od);//ObjectDemo@6d06d69c
		
		
		System.out.println("abc".getClass());//class java.lang.String
		Object o2 = "abc";
		//获取对象实际类型的类
		System.out.println(o2.getClass());//class java.lang.String
	}
}
