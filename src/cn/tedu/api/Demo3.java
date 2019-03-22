package cn.tedu.api;

public class Demo3 {
	
	public static void main(String[] args) {
		//获取的是计算机元年到现在的时间
		long start = System.currentTimeMillis();
		//StringBuilder str = new StringBuilder("a");
		String str = "a";
		for(int i = 0;i<=10000;i++){
			
			//str.append("a");
			str += "a";
		}
		long end = System.currentTimeMillis(); 	
		//System.out.println(str.toString());
		System.out.println(str);
		System.out.println("运行时间："+(end-start)+"毫秒");
		
	}
}
