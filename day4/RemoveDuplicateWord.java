package week1.day4;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		
		String text="We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[] stringArray=text.split(" ");
		
		
		for(int i=0; i<stringArray.length; i++) {
			
			for (int j=i+1; j<stringArray.length; j++) {
				
				if(stringArray[i].equalsIgnoreCase(stringArray[j])) {
					stringArray[j]=" ";
					count=count+1;	
				}
			}
		}
		
		if(count>1)
		{
		for (int k=0; k<stringArray.length;k++) {
			System.out.print(stringArray[k]);
			System.out.print(" ");
		}
	}
}
}
