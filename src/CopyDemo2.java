
public class CopyDemo2 {
	public static void main(String[] args) {
		Product mouse = new Product();
		mouse.price=20000;
		Product keyboard = mouse;
		
		System.out.println("mouse price = "+mouse.price);
		System.out.println("keyboard price = "+keyboard.price);
		
		mouse.price = 100000;
		
		System.out.println("mouse price = "+mouse.price);
		System.out.println("keyboard price = "+keyboard.price);
	}
}

class Product{
	int price;
}