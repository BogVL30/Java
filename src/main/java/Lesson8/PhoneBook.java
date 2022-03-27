package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        System.out.println("Телефонный справочник");
        phonebook.add("Сергеев", "802964553");
        phonebook.add("Петров", "802486235");
        phonebook.add("Алексеев", "3875216823");
        phonebook.add("Петров", "37525654862");
        phonebook.add("Сергеев", "6548413834");
        System.out.println("-----------------------------------");

        System.out.println("Номера по фамилии:");
        System.out.println("Сергеев");
        System.out.println(phonebook.get("Сергеев"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Алексеев");
        System.out.println(phonebook.get("Алексеев"));

    }

    private HashMap<String, List<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (book.containsKey(surname)) {
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Номер: %s || Фамилия: %s", number, surname));
            } else {
                System.out.println(String.format(number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер: %s || Фамилия: %s", number, surname));
        }
    }

    public List<String> get(String surname) {
        if (book.containsKey(surname)) {
            return book.get(surname);
        }
        return null;
    }
}





