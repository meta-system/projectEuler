package projectEuler;

public class ProblemsMain {

	public static void main (String [] args){
		System.out.println("test");
		long temp = 0;
		int[] aP0001 = {3, 5};
		temp = P0001(aP0001, 1000);
		System.out.println(temp);
		System.out.println("test");
	}

	public static long P0001(int [] numbs, int roof){
		long sum = 0;	//sum of all sums, final result
	
		for (int i = 0; i < roof; i++){
			if ((i%numbs[0]) == 0 || (i%numbs[1]) == 0){
				sum = sum + i;
			}
		}
				
		return sum;
	}
}
