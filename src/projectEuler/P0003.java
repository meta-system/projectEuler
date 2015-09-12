package projectEuler;

public class P0003 {

	public static void main(String[] args) {
		long number = 600851475143L;
		long result = 0;
		double sI = Math.sqrt(number);
		long i = (long) sI;
		System.out.println("i = " + i);
		
		while ((result == 0)&&(i > 0)){
			if ((number % i)==0){
				if (isPrime(i)){
					result = i;
					System.out.println("prime");
					break;
				}
			}
			i--;
		}
		System.out.println("result: " + result);

	}
	
	public static boolean isPrime (long number){

		boolean result = true;

		for (long i = 2; i < Math.sqrt(number); i++){
			if ((number % i)==0){
				return false;
			}
		}

		System.out.println("prime2 " + number + " " + result);
		return result;
	}
	
}
