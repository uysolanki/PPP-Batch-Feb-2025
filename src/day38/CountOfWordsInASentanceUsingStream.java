package day38;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfWordsInASentanceUsingStream {

    public static void main(String[] args) {

        String inputString = "one two one two three four one three five five";

        // Count frequency of each word
        Map<String, Long> map = Arrays.stream(inputString.split(" "))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));

        System.out.println(map);

        // Find word with maximum occurrence
        Map.Entry<String, Long> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (maxEntry != null) {
            System.out.println("Word with maximum occurrence: "
                    + maxEntry.getKey() + " -> " + maxEntry.getValue());
        }
    }
}