package exercises.chapter3;
import java.util.ArrayList;
public class ArrayListExercise {
        /*public static int sumEven(ArrayList<Integer> arr);
        {
            int evenSum=0;
            for(int even : arr) {
                if (even % 2 == 0) {
                    evenSum += even;
                }
            }
            System.out.println(evenSum);
        }*/

       public static void main(String[] args)
       {
           int[] num = {3,8,6,10,9,4};
           int sum = 0;
           ArrayList<Integer> arr = new ArrayList<>();
           for(int i : num){
               if (i%2 == 0)
               {
                   sum+=i;
                   arr.add(i);
               }
           }
           System.out.println(arr);
           System.out.println(sum);

}}
