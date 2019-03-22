package cn.tedu.stringdemo;
/*
 * compareto
 */
public class StringTest6 {
	public static void main(String[] args) {
		String str1 = "abcz";
		String str2 = "abcqweq";
		//字符串底层使用字符数组
		//compareTo方法使用字符数组进行逐位比较
		//如果长度不同，但是前面的内容都相同，那么返回的是长度之差
		//如果有字符不相同，那么返回的就是字符之差
		//如果完全相等，那么返回长度之差
		//如果返回值是正数，代表调用的对象大
		//如果是负数，代表参数对象大
		int i = str1.compareTo(str2);
		System.out.println(i);
	}
}
