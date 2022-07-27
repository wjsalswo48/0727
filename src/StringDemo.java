
public class StringDemo {
	public static void main(String[] args) {
//		String name; //변수(객체)선언, declaration
//		name = "한지민";//할당, Assignment
//		System.out.printf("이름 = %s\n",name);
		
//		String name = new String("한지민");
//		System.out.printf("이름 = %s\n",name);
		
		Student jimin;
		jimin = new Student();
		jimin.name="한지민";
		jimin.age=26;
		System.out.println("한지민 학생 정보");
		
		System.out.printf("이름 = %s, 나이 = %d \n",jimin.name,jimin.age);
		
		Student chulsu;
		chulsu = new Student();
		chulsu.name="김철수";
		chulsu.age=25;
		System.out.println("김철수 학생 정보");
		System.out.printf("이름 = %s, 나이 = %d \n",chulsu.name,chulsu.age);
		
		Student younghee;
		younghee = new Student();
		younghee.name="한지민";
		younghee.age=26;
		System.out.println("이영희 학생 정보");
		System.out.printf("이름 = %s, 나이 = %d \n",younghee.name,younghee.age);
	}
}
