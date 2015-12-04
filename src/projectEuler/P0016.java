package projectEuler;

import java.math.BigInteger;

import static java.lang.Math.pow;

public class P0016 {

    public static void main (String[] args){
        BigInteger myBigInt = BigInteger.valueOf(2);
        myBigInt = myBigInt.pow(1000);
        System.out.println(myBigInt);
        System.out.println(sumOfDigits(myBigInt));

    }

    public static int sumOfDigits(BigInteger input){
        int sum = 0;
        int[] myInput = stringToDigits(input.toString());

        for (int aMyInput : myInput) {
            sum += aMyInput;
        }

        return sum;
    }

    public static int[] stringToDigits(String myString){
        int[] digits = new int[myString.length()];

        for (int i = 0; i < myString.length(); i++){ //convert the String to an int array
            digits[i]= myString.charAt(i) -48;
        }

        return digits;
    }

}
