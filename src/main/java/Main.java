
/**
 * Main class. 
 **/

public class Main {
	public static void main(String[] args){
		Calculator c = new Calculator();
		System.out.println(c.divide(0, 0));
		System.out.println(c.add(8, 8));
		System.out.println(c.subtract(10, 5));
		System.out.println(c.multiply(3, 3));
	}

}
