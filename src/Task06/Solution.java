package Task06;

import java.util.Arrays;
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
        String a1 = a.replaceAll("\\s", "");
        String b1 = b.replaceAll("\\s", "");

        boolean booleanFlag = true;
        if(a1.length() == b1.length()){
            char[] ArrayA1 = a1.toLowerCase().toCharArray();
            char[] ArrayB1 = b1.toLowerCase().toCharArray();
            Arrays.sort(ArrayA1);
            Arrays.sort(ArrayB1);
            if(ArrayA1==(ArrayB1)){
                booleanFlag = true;
            }
        } else {
            booleanFlag = false;

        }
        return booleanFlag;
    }
}
