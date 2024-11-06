package homework_40;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов мля, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    public static ArrayList<String> getUniqueSortedWords(String testString) {

        String newString = testString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] words = newString.split(" "); // Массив из слов

        Comparator<String> sizeComparator = (s1, s2) -> {
            return s1.length() - s2.length(); // Сортировка по длине
        };
        Arrays.sort(words, sizeComparator);  // отсортированный массив из слов
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        return new ArrayList<>(uniqueWords);
    }
}
