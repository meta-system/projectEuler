package projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Christian on 01.12.2015.
 */
public class P0020 {

    public static final int startNumb = 12;

    public static void main (String [] args){
        BigInteger[] myBigInts = new BigInteger[startNumb + 1];

        for (BigInteger elem : myBigInts){
            elem = BigInteger.ONE;
        }
        for (int i = 0; i < myBigInts.length; i++) {
            myBigInts[i] = BigInteger.ONE;
        }

        for (int i = 2; i < startNumb; i++) {
            System.out.println(myBigInts[i] + " " + i);
            myBigInts[i+1] = myBigInts[i].multiply(BigInteger.valueOf(i));
        }
        System.out.println(myBigInts[myBigInts.length] + "\n");

//        int iFact = 1;
//        for (int i = 1; i < startNumb; i++) {
//            System.out.println(iFact + " " + i);
//            iFact *= i;
//        }
//        System.out.println(iFact);
    }

}
