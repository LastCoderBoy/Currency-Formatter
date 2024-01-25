package CurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static String us;
    public static String india;
    public static String china;
    public static String france;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        currencyConverter(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public static void currencyConverter(double price){
        NumberFormat currencyForChina = NumberFormat.getCurrencyInstance(Locale.CHINA); //Getting China Currency as an object
        china = currencyForChina.format(price);

        NumberFormat currencyForUS = NumberFormat.getCurrencyInstance(Locale.US); //Getting the US Currency as an object
        us = currencyForUS.format(price);

        NumberFormat currencyForFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE); //Getting France Currency as an object
        france = currencyForFrance.format(price);

        NumberFormat currencyForIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); //Creating a new Locale for India
        india = currencyForIndia.format(price);                                                                   // and then storing it into an object
    }
}
