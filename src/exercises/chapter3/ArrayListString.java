package exercises.chapter3;
import java.util.ArrayList;
public class ArrayListString {
    public static void main(String[] args){
        String[] str = {"Divya","nayan","meera","jiyansh","vaibhavi","vishal","mamta"};
        ArrayList<String> strList = new ArrayList<>();
        for(String s : str){
            if(s.length() == 5){
                strList.add(s);
            }
        }
        System.out.println(strList);
    }
}
