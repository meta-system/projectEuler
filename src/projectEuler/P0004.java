package projectEuler;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class P0004 {

	
	
	public static void main(String[] args) {
		
		Queue<Integer> myPalindromes = new LinkedList<Integer>();
		
		int result = 0;
		
		for (int a = 999; a > 99; a--){
			for (int b = 999; b > a; b--){
				result = a*b;
				if (isPalindrome(result)){
					System.out.println(a + "*" + b + " = " +result);
					
					myPalindromes.add(result);
				}

			}
			
		}
		result = Collections.max(myPalindromes);
		System.out.println("result: " + result );

	}

	public static boolean isPalindrome(int number){
		String numberS = String.valueOf(number);
		boolean result = true;
		for (int i = 0; i < (numberS.length()/2); i++){
			if (numberS.charAt(i) != numberS.charAt(numberS.length()-i-1)){
				result = false;
			}
		}
		return result;
	}
}
