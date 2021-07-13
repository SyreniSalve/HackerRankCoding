package Task12;

import com.ibm.icu.text.NumberFormat;

import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usaFormat = NumberFormat.getCurrencyInstance();

        Locale india = new Locale("en","IN");
        NumberFormat indianFormat =  NumberFormat.getCurrencyInstance(india);

        Locale china = new Locale("zh","CN");
        NumberFormat chineseFormat = NumberFormat.getCurrencyInstance(china);

        Locale france = new Locale("fr","FR");
        NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(france);


        System.out.println("US: " + usaFormat.format(payment));
        System.out.println("India: " + indianFormat.format(payment));
        System.out.println("China: " + chineseFormat.format(payment));
        System.out.println("France: " + frenchFormat.format(payment));
    }
}
