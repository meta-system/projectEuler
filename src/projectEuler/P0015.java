package projectEuler;

public class P0015 {

	public static void main(String[] args) {
		
		int iDim = 2;
		int dim = iDim +1;
		int dimX, dimY = dim;
		boolean [][] pos = new boolean [dimX][dimY];
		int ways = 0, x = 4, y = 4;
		boolean test = false;
		
		while (!test){
			if ((x >= pos.length)&&(y < dim +1)){
				
			} else if ((x < pos.length)&&(y >= pos dim +1)){
				
			} else {
				System.out.printf("Error at (%d|%d)", x, y );
				break;
			}
			
			/*if (!pos[x][y]){
				x++;
			} else {
				y++;
			}*/
		}/*
		for(int i = 0; i < pos.length; i++){
			for (int j = 0; j < pos[i].length; j++){
				
			}
			ways++;
			
		}*/
	}

}
