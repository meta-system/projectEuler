package projectEuler;

public class P0002 {

	public static void main(String[] args) {
		long low, up, result, temp =0;
		long roof = 4000000L;
		result = 2;
		low = 1;
		up = 2;
	
		while (up < roof){
			if ((low+up)%2 == 0){
				result = result + low + up;
			}temp = up;
			up = low + up;
			low = temp;
		}

		System.out.println("result: " + result);
	}

}
