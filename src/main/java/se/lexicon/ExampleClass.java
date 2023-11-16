package se.lexicon;

import java.util.Scanner;

public class ExampleClass {
    public static void main(String[] args) {
        /*class Car{
            String carBrand="Tesla";
            String regNo="ABC123";
            int maxSpeed=200;
            String ownerName="AAAAA";
            int brandYear=2020;
        }
        Car c1 =new Car();
        System.out.println("Brand:"+c1.carBrand);
        System.out.println("Registration Number:"+c1.regNo);
        System.out.println("Maximum Speed:"+c1.maxSpeed);
        System.out.println("Owner Name:"+c1.ownerName);
        System.out.println("Car Brand Released year:"+c1.brandYear);*/
        int score;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your mark:" );
        score=input.nextInt();

if (score>=65){
    System.out.println("Hurray,You Passed!");
} else if (score>=55 && score <=64) {
    System.out.println("You are almost there");
}
else {
    System.out.println("Sorry, you didn't pass");
}
}

    }
