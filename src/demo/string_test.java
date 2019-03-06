package demo;
import java.util.*;
public class string_test {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		String str = convert(arr,3);
		System.out.println(str);
	}
	public static String convert(char[] s,int numRows) {
		if(s == null || numRows == 0) {
			return s.toString();
		}
		int step = 2*numRows-2;
		int row = 0;
		int current = 0;
		int currentNeibor = 0;
		StringBuffer sb = new StringBuffer(s.length);
		for(int i=0;i<s.length;i+=step) {
			sb.append(s[i]);
		}
		row++;
		for(;row<numRows-1;row++) {
			current = row;
			while (current<s.length) {
				sb.append(s[current]);
				currentNeibor = current+step-2*row;
				if(currentNeibor<s.length) {
					sb.append(s[currentNeibor]);
				}
				current = current+step;
			}
		}
		for(;row<s.length;row+=step) {
			sb.append(s[row]);
		}
		return sb.toString();
	}
}
