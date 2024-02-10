package package_Home_Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number =11, count=0;
		
		for(int i=1;i<=number/2;i++) {
			
			
			if(number%i ==0) {
				
				count++;
			}}
			
			if(count>1) {
				
				System.out.println(number+ " is not prime number ");
			}
			else {
				
				System.out.println(number+ " is prime number ");
			}
		
	}

}
