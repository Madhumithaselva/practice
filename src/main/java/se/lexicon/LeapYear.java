package se.lexicon;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        int year;
        System.out.println("Enter a year: \n>");
        Scanner sc = new Scanner(System.in);
        year=sc.nextInt();

        if ((year%4==0)&&(year%100!=0) || (year%400==0))
            System.out.println(year+ " is leap year");
        else
            System.out.println(year + " is not a leap year");
        sc.close();

    }
}
