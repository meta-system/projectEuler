package projectEuler;

public class P0005 {

	public static void main(String[] args) {
		boolean fNumb = false;
		int result = 0;
		
		for (int i = 2520; ;i++){
			for (int j = 1; j <= 20; j++){
				if ((i%j) != 0){
					break;
				}
				if (j == 20){
					fNumb = true;
				}
			}
			if (fNumb){
				result = i;
				break;
			}
		}
		
		System.out.println("result: " + result );

	}

}
