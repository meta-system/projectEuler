package projectEuler;

import java.util.LinkedList;
import java.util.Queue;

public class P0009 {

	public static void main(String[] args) {

		/*
		 *Setze  	a := m2 - n2
		 * und	b := 2mn 	
		 * Dann ist: 	c2 	= a2 + b2
		 * 	= (m2 - n2)2 + (2mn)2
		 * 	= m4 - 2m2n2 + n4 + 4m2n2
		 * 	= m4 + 2m2n2 + n4
		 * 	= (m2 + n2)2
		 * und	c	= m2 + n2
		 * 
		 * Bei unserem Problem:
		 * 
		 * a + b + c = 1000
		 * 
		 * Setze für a und b ein
		 * 
		 * 2m2 + 2mn = 1000
		 * 2m(m+n) = 1000
		 * m+n = 500/m
		 * n = 500/m - m
		 * 
		 * Also nun nur stur a und b ausprobieren!
		 */
		int number = 1000;
		int myNumber = number/2;
		int n = 0, b = 0, a = 0, result = 0, m;
		Queue<Integer> factors = new LinkedList<Integer>();
		
		for(int i = 1; i <= 500; i++){
			if (myNumber%i == 0){
				factors.add(i);
			}
		}
		
		while (factors.peek()!=null){
			m = factors.peek();
			n = myNumber/m-m;
			b = 2 * m * n;
			a = (m*m)-(n*n);
			if((0 < n)&&(0<b)&&(0<a)){
				System.out.println(m);
				result = a * b * (m*m+n*n);
				System.out.println("result: " + result);
			}
				factors.poll();
			
		}
		
		
	}

}
