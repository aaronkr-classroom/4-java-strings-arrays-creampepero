
public class Ex502 {
	public static double add(double a, double b) {
		return a+b;		
	}
	public static double sub(double a, double b) {
		return a-b;
	}
	public static double mult(double a, double b) {
		return a*b;
	}
	public static double div(double a, double b) {
		return a/b;
	}
	public static double max(double a, double b) {
		if (a >= b) return a;
		else return b;
	}
	public static double min(double a, double b) {
		if (a <= b) return a;
		else return b;
	}
	public static void factorial(double a) {
		int result = 1;
		for (int i = 1; i <=a; i++) {
			result *= i;
		}
		System.out.println("Factorial of " + a + "! " + result);
	}
	//circle
	public static void circ(int a) {
		String result = "Pizza size: " + 2 * a * 3.1415 + "inches: ";
		System.out.println(result); //Math.PI
	}
	public static void circ(double a) {
		String result = "Pizza size: " + 2 * a * 3.1415 + "inches: ";
		System.out.println(result); //Math.PI
	}
	public static void area(int a) {
		String result = "Pizza size: " + a * a * 3.1415 + "inches: ";
		System.out.println(result); //Math.PI
	}
	public static void area(double a) {
		String result = "Pizza size: " + a * a * 3.1415 + "inches: ";
		System.out.println(result); //Math.PI
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 15;
		int b = 7;
		
		System.out.println("Calculator program: ");
		System.out.println("Add: " + a + " + " + b + " = " + add(a,b));
		System.out.println("Subtract: " + a + " - " + b + " = " + sub(a,b));
		System.out.println("Multiply: " + a + " * " + b + " = " + mult(a,b));
		System.out.println("Divide: " + a + " ÷ " + b + " = " + div(a,b));
		System.out.println("Max(" + a + ", " + b + "): " + max(a,b));
		System.out.println("Min(" + a + ", " + b + "): " + min(a,b));
		
		factorial(a);
		factorial(b);
		
		// Circle (pizza) Calculate
		circ(b);
		area(b);
		
		circ(12);
		circ(1.2456);
		
		float c = 12.345f;
		circ(c);

	}

}
