package projectEuler;

public class pimeNumbs {

	public static void main (String [] args){
		int[] pZahlen;
		pZahlen = new int[1000];
		int temp = 1;
		int i = 1;
		int prim = 3;
		pZahlen[0] = 2;
		pZahlen[1] = 3;
		temp = 2;

		while (temp <= pZahlen.length) {	//setze so oft in den aktuellen Slot des Arrays etwas ein, bis dieser voll ist
			while (i <= temp) { 

				if ((i == temp) && (prim % pZahlen[i]) == 0) {
					temp++;						//solange die aktuell gepr�fte Variable mittels Werten gepr�ft wird,
					pZahlen[temp] = prim;
					System.out.print(pZahlen[temp] + " ");
					i = 1;	
					prim += 2;
				}
				//die vor oder auf dem aktuell letzten(tempor�ren) Slot liegen,
				/*												//und die Pr�fungen positiv ausfallen, pr�fe weiter
			if (i == temp) {					//Wenn du die Variable mit allen bisher bekannten Werten gepr�ft hast
				temp++;							//...setze den Slot im Array um 1 h�her
				pZahlen[temp] = prim;			//und weise diesem Slot die gerade ermittelte Zahl zu
				System.out.print(pZahlen[temp] + " ");	//gib die gerade ermittelte Zahl aus

				i = 1;							//setze den counter f�r die tests zur�ck
				prim += 2;
			}*/
				else if ((i == temp) && (prim % pZahlen[i]) != 0){
					i = 1;	
					prim += 2;
				}
				else  {
					i++;
				}

			}

		}

		for (int q = 0; q < pZahlen.length; q++) {
			System.out.print(pZahlen[q] + " ");
		}
	}

	
}
