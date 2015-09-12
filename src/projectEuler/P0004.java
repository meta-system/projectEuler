package projectEuler;

public class P0004 {

	public static void main(String[] args) {

		int result = 0;
		boolean hasResult = false;

		for (int a = 999; a > 100; a--){
			for (int b = 999; b > a; b--){
				result = a*b;
				if (isPalindrome(result)){
					hasResult = true;
					break;
				}

			}
			if (hasResult){
				break;
			}
		}

		System.out.println("result: " + result);

	}

	public static boolean isPalindrome(int number){
		String numberS = String.valueOf(number);
		System.out.println(numberS);
		boolean result = true;
		for (int i = 0; i < (numberS.length()/2); i++){
			if (numberS.charAt(i) != numberS.charAt(numberS.length()-i)){
				result = false;
			}
		}
		return result;
	}
}
