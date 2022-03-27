package Lesson8;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Собака", "Кот", "Корова", "Слон", "Слон",
                "Ворона", "Собака", "Ёж", "Кот", "Слон",
                "Собака", "Кот", "Слон", "Корова", "Собака");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Список слов: ");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Повторений: ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
