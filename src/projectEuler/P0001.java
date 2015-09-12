package projectEuler;

public class P0001 {

	public static void main(String[] args) {
		long result = 0;	//result of all sums, final result
		int [] numbs = {3, 5};
		int roof = 1000;
		
		for (int i = 0; i < roof; i++){
			if ((i%numbs[0]) == 0 || (i%numbs[1]) == 0){
				result = result + i;
			}
		}

		System.out.println("result: " + result);
	}

}
