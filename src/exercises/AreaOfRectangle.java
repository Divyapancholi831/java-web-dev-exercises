package exercises;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        double length;
        double width;
        double area;
        Scanner input=new Scanner(System.in);
        System.out.println("length of rectangle :");
        length=input.nextDouble();
        System.out.println("width of rectangle :");
        width=input.nextDouble();
        input.close();
        area=length*width;
        System.out.println("the area of the rectangle is :"+ area);
    }
}
