package exercises.chapter3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] arrayDemo = {1,1,2,3,5,8};
        for(int demo : arrayDemo) {
            if (demo % 2 != 0) {
                System.out.println(demo);
            }
        }
        String phrase="I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] newStringArray=phrase.split(" ");
        String[] newSentencesArray = phrase.split("\\.");
        System.out.println(Arrays.toString(newStringArray));
        System.out.println(newStringArray.length);
        System.out.println(Arrays.toString(newSentencesArray));
        System.out.println(newSentencesArray.length);
    }
}
