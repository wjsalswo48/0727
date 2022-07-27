import java.lang.Integer;
import java.util.Scanner;
public class MethodAccessDemo {
	public static void main(String[] args) {
		int su = 345678;
		String result = Integer.toBinaryString(su);
		System.out.println(result);
		result = Integer.toHexString(su);
		System.out.println(result);
		
		String msg = "Hello";
		char ch = msg.charAt(0);
		
		Scanner sn = new Scanner(System.in);
		char ch2 = sn.next().charAt(0);
		System.out.println();
	}
}
