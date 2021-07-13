package Task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger b = new BigInteger(n);

        boolean result1, result2, result3;

        result1 = b.isProbablePrime(0);
        result2 = b.isProbablePrime(1);
        result3 =  b.isProbablePrime(-1);

        if (result1 && result2 && result3){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
