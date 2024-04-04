import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3WordOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = str.split(" ");

        int totalWords = 0;
        for (String word : words) {
            totalWords++;
            if (wordCountMap.containsKey(word))
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            else
                wordCountMap.put(word, 1);
        }

        System.out.println("Total number of words in the string: " + totalWords);
        System.out.println("Word Occurrence Count:");
        System.out.println(wordCountMap);

        scanner.close();
    }
}
