package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String str= "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        /*String[] strArray=str.split("\\s+");*/
        System.out.println(str);
        System.out.println("\n Search any Word within this string");
        String searchStr=input.next();
        if(str.toUpperCase().contains(searchStr.toUpperCase()))
        {
            System.out.println("true");
            Integer index=str.indexOf(searchStr);
            Integer strLength=searchStr.length();
            System.out.println("Your search term first appears at index "+ index + ".");
            System.out.println("Your term is "+ strLength+ " characters long.");
            String modifiedStr=str.replace(searchStr,"");
            System.out.println(modifiedStr);
        }
        else
        {
            System.out.println("false");
        }
    }
}
