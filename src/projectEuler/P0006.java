package projectEuler;

public class P0006 {

	public static void main(String[] args) {
		
		long sumOfSquare = 0;
		
		for (int i = 0; i <= 100; i++){
			sumOfSquare += i*i;
		}
		long squareOfSum = (101*50)*(101*50);
		long result = squareOfSum - sumOfSquare;
	
		System.out.println("result: " + result );
	}

}
