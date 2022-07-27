
public class CopyDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car();
		Car martiz = new Car();
		
		sonata.price = 25_000_000;
		martiz.price=sonata.price;
		System.out.println("Sonata's price =" + sonata.price);
		System.out.println("Sonata's price =" + martiz.price);
		
		
		sonata.price = 20_000_000;
		martiz.price=sonata.price;
		System.out.println("Sonata's price =" + sonata.price);
		System.out.println("Sonata's price =" + martiz.price);
	}
}

class Car{
	int price;
}