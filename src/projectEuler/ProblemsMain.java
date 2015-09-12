package projectEuler;

public class ProblemsMain {

	public static void main (String [] args){
		System.out.println("test");
		long temp = 0;
		int[] aP0001 = {3, 5};
		temp = P0001(aP0001, 1000);
		System.out.println(temp);
	}

	public static long P0001(int [] numbs, int roof){
		long sum = 0;	//sum of all sums, final result
		long sum1 = 0;	//sum of all multiples of the first number
		long dsum = 0;	//sum of the double counts
		int dSumC = 0;  //count of double counts
		long cur = 0;	//current multiple
		int i = 0;		//current grade of multiplication

		for (int n = 0; n < numbs.length; n++){
			sum1 	= 0;
			dsum 	= 0;
			cur 	= 0;
			i 		= 0;

			while (cur < roof){ //solange aktuelles Vielfaches kleiner bleibt als das gegebene maximum
				cur = (numbs[n]) * i; // rechne neues Vielfaches aus
				if (cur > roof){ // wenn das neue Vielfache jetzt größer ist, brich ab
					break;
				}
				sum1 = sum1 + cur; // addiere aktuelles Vielfaches zu der bestehenden Summe hinzu
				for (int j = n + 1; j < (numbs.length); j++ ){ //setze mit der aktuellen zahl an und prüfe nacheinander alle Elemente im Array nach doubles
					if ((cur % numbs[j])==0){  //Wenn das aktuelle Vielfache restlos durch eine andere Zahl aus dem Array teilbar ist 
						dSumC++;
						dsum = dsum + (numbs[n]*i);
					}
				}				
				i++;
			}
			sum = sum + sum1 - dsum;
		}
		System.out.println(" dsum called " + dSumC);
		return sum;
	}
}
