package exercises.Array.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> example = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            example.add(i);
        }

        int sumArray = sumEvens.sumEven(example);

        System.out.println((sumArray));
    }
}
