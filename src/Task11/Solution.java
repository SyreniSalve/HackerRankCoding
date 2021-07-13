package Task11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while (sc.hasNext()){
            System.out.println(++c + " " + sc.nextLine());
        }
        sc.close();
    }
}
