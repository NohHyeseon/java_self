package framwrok;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMapExample {

        public static void main(String[] args) {
            String text = "apple banana apple cherry cherry cherry banana";
            String[] words = text.split(" ");

            Map<String, Integer> frequencyMap = new HashMap<>();
            for (String word : words) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }

