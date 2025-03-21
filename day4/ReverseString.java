package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		
	String name="Lakshminarayanan";
		//System.out.println(name);
		
		char charArray[]=name.toCharArray();
		int length=charArray.length;
		
		for (int i=length-1 ; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		

	}

}
