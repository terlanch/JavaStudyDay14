package cn.tedu.api;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		String str = "ABC137GMNQQ2049PN5FFF";
		String numStr = "";
		//ȡ�������ֵ��ַ�
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			if(c>='0'&&c<='9'){
				numStr = numStr+c;
			}
		}
		//���µ��ַ���ת��Ϊ�ַ������������
		char[] arr = numStr.toCharArray();
		for(int j = 0;j<numStr.length();j++){
			arr[j] =  (char) (numStr.charAt(j));
		}
		Arrays.sort(arr);
		//�ٽ��ַ�����ת��Ϊ�ַ������
		String str1 = new String(arr);
		System.out.println(str1);
		
	}
}
