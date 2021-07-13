package Task08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {
        String a1 = a.replaceAll("\\s", "").toLowerCase();
        String b1 = b.replaceAll("\\s", "").toLowerCase();

        if (a1.length() != b1.length()) {
            return false;
        }
        for (int i = 0; i < a1.length(); i++) {
            char c = a1.charAt(i);
            int index = b1.indexOf(c);

            if (index != -1) {
                b1 = b1.substring(0, index) + b1.substring(index + 1, b1.length());
            } else {
                return false;
            }
        }
        return b1.isEmpty();
    }

}
