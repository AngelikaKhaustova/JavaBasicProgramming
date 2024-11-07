package homework_41;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки" +
                ".\n Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для vkz проверки";

        Map<String, Integer> mapOfWords = countWords(text);
        System.out.println(mapOfWords);
    }

    private static Map<String, Integer> countWords(String str){
        String newString = str.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] words = newString.split(" "); // Массив из слов

        Map<String, Integer> mapTask1 = new HashMap<>();
        int count;
        for (int i = 0; i < words.length ; i++) {
            if (mapTask1.containsKey(words[i])) {
                count = mapTask1.get(words[i]);
                mapTask1.put(words[i], count + 1);
            }
            else {
                mapTask1.put(words[i], 1);
            }
        }
        return mapTask1;
    }
}
