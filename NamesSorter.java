package NamesSorter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NamesSorter {
    public static List<String> processStrings(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "date", "fig");
        List<String> processedStrings = processStrings(strings);
        System.out.println(processedStrings);
    }
}








