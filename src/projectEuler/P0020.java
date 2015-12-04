package projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class P0020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfDigits(factorial(sc.nextInt())));
    }

    public static BigInteger factorial(int i) {
        BigInteger n = BigInteger.ONE;

        for (int j = 1; j <= i; j++) {
            n = n.multiply(BigInteger.valueOf(j));
            if (j%10 ==0){
                System.out.println("\n" + j + " " + n);
            }
        }

        return n;
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