package org.launchcode.java.studio.chapter3;
import java.util.HashMap;
import java.util.Scanner;
public class colletionStudio {
    public static void main(String[] args)
    {
        String string = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into" +
                " a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";
        char ch;
        int count;
        HashMap<Character,Integer> charSet = new HashMap<>();
        for(int i=0;i<string.length();i++){
            ch=string.charAt(i);
            if(charSet.containsKey(ch)){
                count=charSet.get(ch);
                count++;
                charSet.replace(ch,count);
            }else
            {
                charSet.put(ch,1);
            }
        }
        for(Character single : charSet.keySet()){
            System.out.println(single + ":" +charSet.get(single));
        }
    }
}
