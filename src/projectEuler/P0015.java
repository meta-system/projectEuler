package projectEuler;

public class P0015 {
	
	public static int dimX = 3; //count of squares along the x axis +1
	public static int dimY = 3; // "	"  "       "     "   y "    "
	
	public static void main(String[] args) {
		int result = ways(dimX,dimY);
		System.out.println("result: " + result );
	}
	
	public static int ways(int x, int y){
		int sumX = 0, sumY = 0;
		if ((x <= 0)||(y <= 0)){
			return 1;
		} else {
			sumX = ways(x-1, y);
			sumY = ways(x, y-1);
			return (sumX + sumY);
		}		
	}
}
