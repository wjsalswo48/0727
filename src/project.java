import java.util.Scanner;

public class project {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee ep = new Employee();
		System.out.print("사원 번호 :");
		ep.empono = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원 이름 :");
		ep.ename = sc.nextLine();
		
		System.out.print("사원 생년 :");
		ep.birthYear = sc.nextInt();
		
		System.out.print("사원 월급 :");
		ep.salary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원 이메일 :");
		ep.email = sc.nextLine();
		
		System.out.print("사원 전화번호 :");
		ep.tel = sc.nextLine();
		
		System.out.print("정규직 :");
		ep.flag = sc.nextBoolean();
		
		ep.birthYear = 2022 - ep.birthYear + 1;
		
		System.out.println("사원 번호 :"+ep.empono);
		System.out.println("사원 이름 :"+ep.ename);
		System.out.println("사원 나이 :"+ep.birthYear);
		System.out.println("사원 월급 :"+ep.salary);
		System.out.println("사원 이메일 :"+ep.email);
		System.out.println("사원 전화번호 :"+ep.tel);
		System.out.println("정규직 :"+ep.flag);
	}
	
}
class Employee{
	int empono;
	String ename;
	int birthYear;
	int salary;
	String email;
	String tel;
	boolean flag;
}