package homework_42;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Анаграммы ли "+ str1 + " & " + str2 + " = "+ isAnagramm(str1, str2));

        str1 = "triangle";
        str2 = "integral";
        System.out.println("Анаграммы ли "+ str1 + " & " + str2 + " = "+ isAnagramm(str1, str2));

        str1 = "apple";
        str2 = "papel";
        System.out.println("Анаграммы ли "+ str1 + " & " + str2 + " = "+ isAnagramm(str1, str2));

        str1 = "hello";
        str2 = "billion";
        System.out.println("Анаграммы ли "+ str1 + " & " + str2 + " = "+ isAnagramm(str1, str2));


        //task 2:
        String str = "Быстрая лиса прыгнула через ленивую собаку. Это текст для проверки подсчета слов разных длин. Один два три один два три четыре пять.";
        int lengthToCount = 3;
        System.out.println(str);
        System.out.println("Количество слов длиной " + lengthToCount + " = " + countWords(lengthToCount, str));
    }

    private static int countWords(int lengthToCount, String str) {
        String[] words = str.trim().replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<Integer, Integer> result = new HashMap<>();
        for (String word : words) {
            Integer amount = result.getOrDefault(word.length(), 0) ;
            result.put(word.length(), ++amount);
        }
        return result.getOrDefault(lengthToCount, 0);
    }

    private static boolean isAnagramm(String str1, String str2){
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (char ch : str1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (char ch : str2.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }


        return map1.equals((HashMap<Character, Integer>) map2);
    }

}
