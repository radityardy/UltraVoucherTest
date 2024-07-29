package LogicTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class main {

        public static void main(String[] args) {
            String[] words = {"cook", "save", "taste", "aves", "vase", "state", "map"};
            List<List<String>> groupedAnagrams = groupAnagrams(words);

            for (List<String> group : groupedAnagrams) {
                System.out.println(group);
            }
        }

        public static List<List<String>> groupAnagrams(String[] words) {
            Map<String, List<String>> anagramMap = new HashMap<>();

            for (String word : words) {
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sortedWord = new String(charArray);

                if (!anagramMap.containsKey(sortedWord)) {
                    anagramMap.put(sortedWord, new ArrayList<>());
                }
                anagramMap.get(sortedWord).add(word);
            }

            return new ArrayList<>(anagramMap.values());
        }
    }


