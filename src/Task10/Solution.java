package Task10;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        scanner.close();

        BigInteger result1, result2;

        result1 = a.add(b);
        result2 = a.multiply(b);

        System.out.println(result1);
        System.out.println(result2);
    }
}
