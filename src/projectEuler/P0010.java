package projectEuler;

public class P0010 {

	public static void main(String[] args) {
		long prim = 3; 				//zu prüfende Zahl
		long sum = 2;
		int count = 1;
		
		long startTime = System.currentTimeMillis();
		
		while(prim < 2000000){
			if (isPrime(prim)){
				sum += prim;
				count ++;
			}
			prim += 2;
		}
	
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		double time = (totalTime /1000.0);
		System.out.println("time in secs " + time);
		System.out.println("count " + count);
		System.out.println("sum of primes below 200000\n" + sum);
		System.out.println("Warning!\nNext step may take up to a minute\n(or maybe more)\ndue to the amount of calculation needed!\n");
		
		
		
		long[] pZahlen;
		pZahlen = new long[2000000];
		prim = 3; 				//zu prüfende Zahl
		sum = 2;
		pZahlen[0] = 2;
		pZahlen[1] = 3;
		
		startTime = System.currentTimeMillis();
		
		for (int i = 1; i< pZahlen.length;){
			if (isPrime(prim)){
				pZahlen[i] = prim;
				sum += prim;
				i++;
			}
			prim += 2;
		}
		
		endTime   = System.currentTimeMillis();
		totalTime = endTime - startTime;
		time = (totalTime /1000.0);
		System.out.println("\ntime in secs " + time);
		System.out.println("count " + 2000000);
		System.out.println("sum of first 2000000 primes\n" + sum);

	}
	
	public static boolean isPrime (long number){

		boolean result = true;

		for (long i = 2; i <= Math.sqrt(number); i+=2){
			
			if ((number % i)==0){
				return false;
			}
			if(i ==2){
				i -= 1;
			}
		}

	//	System.out.println("prime2 " + number + " " + result);
		return result;
	}
}
