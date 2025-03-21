package week1.day4;

public class ReverseOddWord {

	public static void main(String[] args) {
		
		// I am a software tester
		// 0 1  2  3        4
		
		// I ma a erawtfos tester
		
		String test="I am a software tester";
		
		String stringArray[]=test.split(" ");
		
		
		for (int i=0;i<stringArray.length;i++) {
			if (i%2!=0) {
				char[] charArray=stringArray[i].toCharArray();
				for (int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}
			}
				
			else {
					System.out.print(stringArray[i]);
				}
			System.out.print(" ");
	}

	}
}
