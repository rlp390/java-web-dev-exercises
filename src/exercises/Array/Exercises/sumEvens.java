package exercises.Array.Exercises;

import java.util.ArrayList;
public class sumEvens {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int number : arr) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }
}
