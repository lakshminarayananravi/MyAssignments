package week1.day4;

public class LearnString {

	public static void main(String[] args) {
		
		//String Literals
		String name1="TestLeaf";
		String name2="TestLeaf";
		
		//By instantiation
		
		String name3=new String("TestLeaf");
		String name4=new String("TestLeaf");
		
		//.equals method - compare the values of 2 Strings
		//== method - compares the reference address of 2 Strings
		
		//equals method
		System.out.println(name1.equals(name2));
		System.out.println(name3.equals(name4));
		
		// == method
		System.out.println(name1==name2);
		System.out.println(name3==name4);
		System.out.println(name1==name3);
		
		System.out.println("-----------------");
		
		String str="March2025";   //march2025
		
		//To get the length of String
		int lengthOfString = str.length();
		System.out.println(lengthOfString);
		
		//contains partial value
		System.out.println(str.contains("march"));
		
		//equalsIgnorecase
		System.out.println(str.equalsIgnoreCase("march2025"));
		
		//toUppercase - March2025  - MARCH2025
		String upperCase=str.toUpperCase();
		System.out.println(upperCase);

		//toLowercase March2025 - march2025
		String lowerCase=str.toLowerCase();
		System.out.println(lowerCase);
		
		//toCharArray - Convert the String to Character Array
		char[] characters=str.toCharArray();
		//March2025   {'M','a','r','c','h','2','0,'2','5'}
		System.out.println(characters[0]);
		
		System.out.println("------------------");

		String batchName="March25";
		
		//charAt       - Character at
		char charAt=batchName.charAt(1);
		System.out.println(charAt);
		
		//subString - crop a String to its lower format
				//input-1 String     output=1 String
		
		//Begin Index is inclusive
		String subString=batchName.substring(2);
		System.out.println(subString);
		
		String subString2=batchName.substring(2,4);
		System.out.println(subString2);
		
		//split - to convert 1 String to multiple Strings
		
		String batch="WeekDayMarch2025";
		String[] split=batch.split("a");
		System.out.println(split[2]);
		
		   //parseInt
		String amount="1000";
		int rupee=100;
		
		System.out.println(amount+rupee);
		
		//parseInt - Convert String into int -Integer
		int parseInt=Integer.parseInt(amount);
		System.out.println(parseInt);
		
		
		String dollar="10000Rupees";
		String currency="dollar";
		
		
		//ReplaceAll
		String replaceAll=dollar.replaceAll(dollar,currency);
		System.out.println(replaceAll);
		
		   //replaceAll
				String replaceAll1 = dollar.replaceAll(amount, dollar);
				System.out.println(replaceAll1);
		
	}

}
