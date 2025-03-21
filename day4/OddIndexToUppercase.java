package week1.day4;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		// 0 1 2 3 4 5 6 7
		// c h a n g e m e
		  
		String test="changeme";
		
		char charArray[]=test.toCharArray();
		
		for (int i=0;i<charArray.length;i++)
		{
			if(i%2!=0) {
				char ch=Character.toUpperCase(charArray[i]);
				System.out.print(ch);
			}
			else {
				System.out.print(charArray[i]);
			}
		}

	}

}
