package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 21;
		boolean isPrime = true;
		
		for(int i = 2;i<20; i++) {
			
			if(num %1==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime Number");
		}
		
		else {
			System.out.println("Not a Prime Number");
		}

	}

}
