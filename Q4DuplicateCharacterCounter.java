import java.util.*;

public class Q4DuplicateCharacterCounter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

       
        countDuplicateCharacters(str);

        scanner.close();
    }

    
    public static void countDuplicateCharacters(String str) {
        
        Map<Character, Integer> charCountMap = new HashMap<>();

        
        char[] charArray = str.toCharArray();

       
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                
                charCountMap.put(c, 1);
            }
        }

       
        System.out.println("Duplicate characters and their frequencies:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
