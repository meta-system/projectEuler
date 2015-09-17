package projectEuler;

import java.util.LinkedList;
import java.util.Queue;


public class P0012 {

	public static void main(String[] args) {

		int divCount = 0;
		int highCount = 0;
		int goalCount= 500;
		long result = 1;
		Queue<Long> divisors = new LinkedList<Long>();
		
		int i = 1;
		
		
		while (true){
			divCount = 0;
			i++;
			result += i;

			for (long j = 1; j <= Math.sqrt(result); j++){
				if (result % j == 0){
					divCount++;
					divisors.add(j);
					if (Math.sqrt(result)!= j){
						divCount++;
						divisors.add(result/j);
					}
				}
				
			}
			if (divCount > highCount){
				highCount = divCount;
			}
			if(i%100 == 0){
				System.out.println("done " + i +" " + highCount + " "  );
			}
			if(divCount >= goalCount){
				break;
			} else {
				divisors.clear();
			}
		}

		System.out.println(result);
		while(divisors.peek() != null){
			System.out.println(divisors.poll());
		}

	}
}