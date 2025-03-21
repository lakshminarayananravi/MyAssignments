package week1.day4;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		
		if(text1.length()==text2.length()) {
			
			//convert to charArray
			char[] charText1=text1.toCharArray();
			char[] charText2=text2.toCharArray();
			
			//sort the char array
			Arrays.sort(charText1);
			Arrays.sort(charText2);	
			
			if(Arrays.equals(charText1,charText2)){
				System.out.println("The given strings are Anagram");
			}
			else {
				System.out.println("The given strings are not Anagram");
			}
		}
		
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

	}
}
