package week1.day4;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//What is FibbonacciSeries and what is the range
		// 0   1   1   2    3    5
		// 0   1   1
		//Input - 2 Numbers
		//Output-series
		
		//Requirements
		//2 Variables for input
		//1 variable for output
		
		//firstNumber=0
		//secondNumber=1
		//thirdNumber=firstNumber+secondNumber
		
		
		int num=8;
		
		int firstnumber=0;
		int secondnumber=1;
		int thirdnumber;
		
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		
		for (int i=0;i<=num; i++) {
			thirdnumber=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
			
			System.out.println(thirdnumber);
		}
		

	}

}
