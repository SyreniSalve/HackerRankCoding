package Task15;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(in.hasNextLine() && testCases>0){
            String pattern = in.nextLine();
            PatternSyntaxException exception = null;
            try {
                Pattern.compile(pattern);
            } catch (PatternSyntaxException e) {
                exception = e;
            }
            if (exception != null) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }

            testCases -= 1;
        }
        in.close();
    }
}
