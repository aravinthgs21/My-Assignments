package week1.day2;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//datatype[]  variables= {values};
		int [] scores = {99,95,97,90,100};
		
		//finding length of an array
		int len = scores.length;
		System.out.println("The length of the array is "+len);
		
		//retrieve a single values in an array
		System.out.println(scores[2]);
		
		//sort
		Arrays.sort(scores);
		
		//print values of an array
		for(int i=0;i<len;i++) {
			System.out.println(scores[i]);
		}
		
		//reverse
		for(int i=len-1;i>=0;i--) {
			System.out.println(scores[i]);
		}


	}

	static void sort(int[] scores) {
		// TODO Auto-generated method stub
		
	}

}
