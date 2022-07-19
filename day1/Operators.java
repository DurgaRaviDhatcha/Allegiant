package day1;

public class Operators {
	

	int a=10,b=5;
	public void arithmetic() {

	System.out.println("1. Arithmetic Operators");
	System.out.println("Addition: "+(a+b));
	System.out.println("Subtraction: "+(a-b));
	System.out.println("Multiplication: "+(a*b));
	System.out.println("Division: "+(a/b));
	System.out.println("Modulo: "+(a%b));
	System.out.println("-----------------------------------");
	}
	public void assignment() {
		int a1=20;
	System.out.println("2. Assignment Operators"); 
	System.out.println("Addition: "+(a1+=b)); //a1=a1+b
	System.out.println("Subtraction: "+(a1 -= b)); 
	System.out.println("Multiplication: "+(a1*=b));
	System.out.println("Division: "+(a1/=b));
	System.out.println("Modulo: "+(a1%=b));
	System.out.println("Addition: "+(a1=b)); 
	System.out.println("Addition: "+(a1)); 
	
	System.out.println("-----------------------------------");
	}
	
public void incrementdecrement() {

	System.out.println("3. Auto increment and auto decrement");
	System.out.println("Increment:"+(++a));
	System.out.println("Decrement:"+(--b));
	//System.out.println("Increment:"+(a++));
	//System.out.println("Decrement:"+(b--));
	System.out.println("------------------------------------");
}
	
	public void logical() {
System.out.println("4. Logical operator");
System.out.println("Logical AND operator");

System.out.println((7 > 3) && (3 > 1));  
System.out.println((7 > 3) && (3 < 1));	

System.out.println("Logical OR operator");

System.out.println((7 > 3) || (3 < 1));
System.out.println((7 < 3) || (3 < 1));

System.out.println("Logical NOR operator");
System.out.println (!( 7 == 7));
System.out.println (!(25 > 24));
System.out.println (!(30 < 25 ));
System.out.println("---------------------------------------");
	}

public void retaional() {
System.out.println("Relational Operators");
System.out.println("a=" +a + " b=" +b);
System.out.println(a==b);
System.out.println(a!=b);
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a>=b);
System.out.println(a<=b);
System.out.println("---------------------------------------");
}

public void ternary() {
System.out.println("Ternary operator");
System.out.println((a>b) ? (a+b):(a-b));
}
public static void main(String[] args) {
	Operators o = new Operators();
      o.arithmetic();
      o.assignment();
      o.incrementdecrement();
      o.logical();
      o.retaional();
      o.ternary();
}
}

