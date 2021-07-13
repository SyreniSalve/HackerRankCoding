package Task02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            if (i > 0) {
                System.out.println("\n");
            }
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


            int count = a + b;
            System.out.print(count + " ");
            int result1;
            int result2 = 0;
            int result = 1;
            for (int j = 1; j < n; j++){
                result =  result * 2;
                result1 = result * b;
                result2 += result1;
                System.out.print(count + result2 + " ");
            }
        }
        in.close();
    }
}
