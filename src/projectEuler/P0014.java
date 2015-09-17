package projectEuler;

public class P0014 {

	public static void main(String[] args) {


		long start = 0;
		long cur = 0;
		long result = 0;
		long bigStart = 0;
		long bigResult = 0;

		while (start < 1000000){
			cur = ++start;
			result = 1;
			while(cur > 1){
				if (cur%2 ==0){
					cur /= 2;
				} else {
					cur = cur * 3 + 1;
				}
				result++;
			}
			result ++;
			if(result > bigResult){
				bigResult = result;
				bigStart = start;
			}

		}
		System.out.println("length of chain: " + bigResult + "\ncaused by starting number: " + bigStart);

	}

}
