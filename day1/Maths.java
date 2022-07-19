package day1;

public class Maths {
	
public void add(int a, int b) {
	System.out.println("Addition:"+ (a+b));
}
public void sub(int a, int b) {
	System.out.println("Subraction:"+ (a-b));
}
public void mul(int a, int b) {
	System.out.println("Multiplication:" +(a*b));
     }
	public void div(int a, int b) {
		System.out.println("Division:" +(a/b));	
	}
	public void rem(int a, int b) {
		System.out.println("Reminder:" +(a%b));
	}
	public static void main(String[] args) {
		int a=7, b=2;
		Maths m = new Maths();
		m.add(7, 2);;
		m.sub(a, b);
		m.mul(a, b);
		m.div(a, b);
		m.rem(a, b);
		
	}	
	
}