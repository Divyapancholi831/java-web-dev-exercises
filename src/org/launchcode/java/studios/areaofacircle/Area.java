package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double redius=input.nextDouble();
        double areaOfCircle = Circle.getArea(redius);
        System.out.println("The area of a circle of radius "+redius+" is : " +areaOfCircle);
    }
}
