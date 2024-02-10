package package_Home_Assignments;

public class FibonassiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int number=8, firstTerm=0, secondTerm=1;
		
		for(int i =0;i<number;i++) {
			
			System.out.print(firstTerm+",");
			
			int nextTerm = firstTerm+secondTerm;
			firstTerm= secondTerm;
			secondTerm=nextTerm;
			
		}
	}

}
