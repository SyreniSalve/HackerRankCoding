package Task07;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
    static boolean isAnagram(String a, String b) {
        String a1 = a.replaceAll("\\s", "").toLowerCase();
        String b1 = b.replaceAll("\\s", "").toLowerCase();

        boolean booleanFlag;

        String [] A1 = a1.split("");
        String [] B1 = b1.split("");

        int count = 0;
        int count1 = 0;
        if(A1.length == B1.length) {
            int i = 0;
            while ( i < A1.length) {
                int j = 0;
                while ( j < B1.length ) {
                    if (A1[i].equals(B1[j])) {
                        count1++;
                        i++;
                        break;
                    } else {
                        count++;
                        j++;
                    }
                }
            }
        }
        booleanFlag = count1 == A1.length;
        return booleanFlag ;
    }
}
