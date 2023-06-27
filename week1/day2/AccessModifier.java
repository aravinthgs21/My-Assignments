package week1.day2;

public class AccessModifier {

	public int getnumber() {
    	 return 2;
     }
	
	public boolean hadlunch() {
		return true;
	}
	
	public void geTimeout() {
		System.out.println("No");
	}
	
	public String getcolor(String name, String color) {
		return name +" "+color;
			}
	public static void main(String[] args) {
		AccessModifier am=new AccessModifier();
		System.out.println(am.getnumber());
		//System.out.println(am.hadlunch());
		boolean result=am.hadlunch();
		System.out.println(result);
		
		String getcolor=am.getcolor("GS","BLue");
		System.out.println(getcolor);
	}
	}