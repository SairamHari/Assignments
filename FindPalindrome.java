package package_Home_Assignments;

public class FindPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input =121 ,output =0,  temp =input;
		for(;input!=0;input =input/10) {
			int reminder = input%10;
			
			output = output*10+reminder;
			
		
		}
		 if(output ==temp) {
			 
			 System.out.println("It is a Palindrome");
		 }else {
			 System.out.println("It is not a Palindrome");
		 }
	}

}
