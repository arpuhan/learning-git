package assignment;

public class assignment1 {
	public static void main(String[] args) {
		int a =10, b = 20, c =6;
		System.out.println("The value of a :"+a+"\nThe value of b :"+b+"\nThe value of c : "+c);
		System.out.println("PERFORMING ARITHMETIC/MATHEMATICAL OPERATION");
		int add = a+b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		System.out.println("Arithmatic operator addition : a+b="+a+"+"+b+"="+add);
		System.out.println("Arithmatic operator substraction : a-b="+a+"-"+b+"="+sub);
		System.out.println("Arithmatic operator multiplication : a*b="+a+"*"+b+"="+mul);
		System.out.println("Arithmatic operator division : a/b="+a+"/"+b+"="+div);
		System.out.println("Arithmatic operator muodulo : a%b="+a+"%"+b+"="+mod);
		System.out.println("############################################");
		System.out.println("PERFORMING RELATIONAL/CONDITIONAL OPERATION");
		System.out.println("The value of a :"+a+"\nThe value of b :"+b+"\nThe value of c : "+c);
		boolean equ = a == b;
		boolean ntequ = a != b;
		boolean great = a > c;
		boolean less = c < b;
		boolean grequ = b >= c;
		boolean lesequ = a <= c;
		
		System.out.println("Relational operator Equal to (a == b) : "+a+" == "+b+":"+equ);
		System.out.println("Relational operator  Not Equal to (a != b) : "+a+" != "+b+":"+ntequ);
		System.out.println("Relational operator Greater than (a > c) : "+a+" > "+c+":"+great);
		System.out.println("Relational operator Less than (c < b) : "+c+" < "+b+":"+less);
		System.out.println("Relational operator Greater than or Equal to (b >= c) : "+b+" >= "+c+":"+grequ);
		System.out.println("Relational operator Less than or equal to (a <= c) : "+a+" <= "+c+":"+lesequ);
		System.out.println("############################################");
		System.out.println("PERFORMING LOGICAL OPERATION");
		int c2 = 20;
		System.out.println("The value of a :"+a+"\nThe value of b :"+b+"\nThe value of c : "+c2);
		System.out.println("Logical operator 'AND' (a<b) && (b<c2)");
		if((a<b) && (b<c2)) {
			System.out.println("The smaller one is :"+a);
		}else {
			System.out.println("The greater number is : "+b);
		}
		
		System.out.println("Logical operator 'OR' (a<b || (b>c2)");		
		if((a<b) || (b>c2)) {
			System.out.println("The smaller one is :"+a);
		}else {
			System.out.println("The greater number is : "+b);
		}
		System.out.println("############################################");
		System.out.println("PERFORMING TERNARY OPERATION");
		System.out.println("The value of a :"+a+"\nThe value of b :"+b+"\nThe value of c : "+c);
		int ter = (b<a)? (a+b):(b+c);
		System.out.println("Ternary operation : value = (b<a)? (a+b):(b+c) = "+"("+b+"<"+a+") ? "+"("+a+"+"+b+"): "+"("+b+"+"+c+") = "+ter);
	}

}
