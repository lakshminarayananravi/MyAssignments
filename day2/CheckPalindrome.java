package week1.day2;

public class CheckPalindrome {

	public static void main(String[] args) {
		
        int num=12345;
        int org=num;
		
		int temp=0;
		int rev=0;
		
		
		

		for (temp=num;temp>0;temp=temp/10)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			
		}

		if (org==rev)
		{
			System.out.println("The given number "+ num + " is palindrome" );
		}
		else {
			System.out.println("The given number "+ num + " is not a palindrome");
		}
	}

}
