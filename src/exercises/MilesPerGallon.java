package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of mile have driven");
        double miles= input.nextDouble();
        System.out.println("amount of gas consumed");
        double gas = input.nextDouble();
        double milesPerGallon=miles/gas;
        System.out.println("you are running on "+milesPerGallon+"img");
    }
}
