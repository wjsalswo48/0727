
public class OpDemo {
	public static void main(String[] args) {
		
		int age = 26;
		System.out.printf("%d\n",age);
		System.out.printf("%d\n",++age);//선 증가 후 출력
		System.out.printf("%d\n",age++);//선 출력 후 증가
		System.out.printf("%d\n",age);
		for(int i = 0; i<3; ++i) {
			System.out.printf("%d",i);
			System.out.printf("%d\n",++age);
		}
		
		int su = 345678;
		String result = Integer.toBinaryString(su);
		System.out.println("result = "+result);
		int su1 = ~su;
		result = Integer.toBinaryString(su1);
		System.out.println("result = "+result);
		System.out.println("su1 = "+su1);
		
		boolean flag = (4>6);
		System.out.println("flag = "+flag);
		System.out.println("flag = "+ (!flag) );
		
		Student jimin = new Student();
		
		double result2 = 5+3.14;
		
	}
}
