package cn.tedu.stringdemo;

import java.util.Scanner;

public class StringTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//String str = "1e1uy2eiube1";
		char[] chs = str.toCharArray();
		//�����д��ĸ�ĸ���
		int d = 0;
		//����Сд��ĸ�ĸ���
		int x = 0;
		//�������ֵĸ���
		int s = 0;
		//���������ַ��ĸ���
		int q = 0;		
				
		for(int i = 0;i< chs.length;i++){
			if(chs[i] >= 65 && chs[i] <= 90){
				d++;
			}else if(chs[i] >= 97 && chs[i] <= 122){
				x++;
			}else if(chs[i] >= 48 && chs[i] <= 57){
				s++;
			}else{
				q++;
			}
		}
		System.out.println("��д��ĸ�ĸ�����"+d+",Сд��ĸ�ĸ�����"+x+",���ֵĸ�����"+s+",�����ַ��ĸ�����"+q);
	}
}
