package demo;

import java.util.*;

public class list_repeat_test {
	public static void main(String[] args) {
		System.out.println("�����뼸�������ö��Ÿ�����");
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toString();
		String[] arr  = str.split(",");
		int[] b = new int[arr.length];
		for(int j = 0; j<b.length;j++) {
			b[j] = Integer.parseInt(arr[j]);
		}
		for(int i = 0;i < b.length; i++) {
			while(b[i] != i) {
				if(b[i] == b[b[i]]) {
					System.out.println("�������ظ��������ǣ�"+b[i]);
					break;
				}
				else {
					int temp = b[i];
					b[i] = b[temp];
					b[temp] = temp;
				}
				
			}
		}
				
	}
}
