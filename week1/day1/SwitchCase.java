package week1.day1;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserType = "Safari";
		
		switch(browserType) {
		case "Chrome":
		System.out.println("Opening Chrome Browser");
		break;
		
		case "Edge":
		System.out.println("Opening Edge browser");	
		break;
			
		case "Firefox":
		System.out.println("Opening Firefox browser");	
		break;
		
		default:
		System.out.println("Opening default browser");	
		break;	
				
		
		}
		

	}

}
