package week1.day2;

public class Calculator {
	
	public int addnumbers(int a, int b) {
		int sum=a+b;
		return sum;
	}
	
	public int subnumbers(int c, int d) {
		int sub=c-d;
		return sub;
		
	}
	
	public float dividenumber(int e, int f) {
		float div=e/f;
		return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator results= new Calculator();
		
		System.out.println("Addition of numbers is" + " " +results.addnumbers(3, 3));
		System.out.println("Subtraction of numbers is" + " " +results.subnumbers(10,5));
		System.out.println("Division of numbers is" + " " +results.dividenumber(9,2));

	}

}
