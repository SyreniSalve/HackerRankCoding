package Task17;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuilder reverse = new StringBuilder();
        int length = A.length();
        for (int i = length - 1; i >= 0; i --){
            reverse.append(A.charAt(i));
        }
        if (A.equals(reverse.toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
