package Task20;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s1 = s.replaceAll("\\p{Punct}", " ").replaceAll("\\s+", " ").trim();

        if (! s1.equals("")) {

            String[] S1 = s1.split(" ");

            System.out.println(S1.length);
            for (String value : S1) {
                System.out.println(value);
            }

        } else {
            System.out.println(0);

        }
        scan.close();
    }
}
