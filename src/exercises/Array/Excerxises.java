package exercises.Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Excerxises {
    public static void main(String[] args) {
        int singleLineArray[] = {1,1,2,3,5,8};
        System.out.println(singleLineArray);

        for( int i = 0; i < 6; i++) {
            if ((singleLineArray[i] % 2) == 0) continue;
            System.out.println(singleLineArray[i]);
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] wordsTwo = phrase.split("\\.");
        System.out.println(Arrays.toString(wordsTwo));
    }
}
