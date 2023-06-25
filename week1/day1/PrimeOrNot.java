package week1.day1;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 11;
		boolean isPrime = true;
		
		if (number == 0 || number == 1) {
			System.out.println(number + " is not a Prime number");
		}
		else {
			for(int i =2; i<=number/2; i++) {
				if(number%i == 0) {
					System.out.println(number + " is not a Prime number");		
					isPrime = false;
					break;
				}				
			}	
		}
		if (isPrime == true) {
			System.out.println(number + " is a Prime number");				
		}
	}

}
