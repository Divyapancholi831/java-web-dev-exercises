package exercises.chapter3;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class HashMapExercise {
    public static void main(String[] args){
        //HashMap<String,Integer> studentInfo =new HashMap<>();
        HashMap<String,Integer> studentInfo = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        do{
            System.out.println("Enter Student name: ");
            studentName = input.nextLine();
            if(!studentName.equals(""))
            {
                System.out.println("Enter Student ID number: ");
                Integer studentID = input.nextInt();
                studentInfo.put(studentName,studentID);
                input.nextLine();
            }
        }while(!studentName.equals(""));

        System.out.println("Class roster: ");
        for (Map.Entry<String ,Integer> student : studentInfo.entrySet()){
            System.out.println(student.getValue()+ " : " + student.getKey());
        }
    }
}
