package projectEuler;

public class P0007 {

	public static void main(String[] args) {
		long[] pZahlen;
		pZahlen = new long[10001];
		long prim = 3; 				//zu prüfende Zahl
		long result = 0; 			// solution

		pZahlen[0] = 2;
		pZahlen[1] = 3;
		
		for (int i = 1; i< pZahlen.length;){
			if (isPrime(prim)){
				pZahlen[i] = prim;
				System.out.println(i + " " + pZahlen[i]);
				i++;
			}
			prim += 2;
		}
	
		result = pZahlen[10000];
		System.out.println("result: " + result );

	}
	
	public static boolean isPrime (long number){

		boolean result = true;

		for (long i = 2; i <= Math.sqrt(number); i++){
			if ((number % i)==0){
				return false;
			}
		}

	//	System.out.println("prime2 " + number + " " + result);
		return result;
	}

}
