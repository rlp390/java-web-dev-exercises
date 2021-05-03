package Studios;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.*;
import java.io.*;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter a String:  ");
        //String phrase = input.nextLine();
        //String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Path filePath = Paths.get("C:/", "Users", "rlp39", "Desktop", "Java_String.txt");
        String content = null;
        try {
            content = Files.readString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String phraseLowerCase = content.toLowerCase();
        char[] phraseArray = phraseLowerCase.toCharArray();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        Character[] goodChars = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<Character> charList = Arrays.asList(goodChars);

        for (int i = 0; i < phraseArray.length; i++) {
            if(!characterCounts.containsKey(phraseArray[i])) {
                if(charList.contains(phraseArray[i])) {
                    characterCounts.put(phraseArray[i], 1);
                }
            } else {
                characterCounts.put(phraseArray[i], characterCounts.get(phraseArray[i]) + 1);
            }
        }

        for (HashMap.Entry<Character, Integer> output : characterCounts.entrySet()) {
            System.out.println(output.getKey() + " - " + output.getValue());
        }
    }
}
