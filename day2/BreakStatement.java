package week1.day2;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=10; i>0;i--) {
			if(i==7) {
				System.out.println("Seven");
				break;
			}
			System.out.println(i);
		}
		System.out.println("Out of the Loop");

	}

}
