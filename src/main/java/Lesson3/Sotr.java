package Lesson3;

public class Sotr {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Alex", "Alex21.com", "Driver", 21, 600, 54896);
        persArray[1] = new Person("Morty", "asd.sad", "Student", 13, 100, 23141);
        persArray[2] = new Person("Victor", "VAk47.gmail.com", "Lawyer", 51, 3412, 41341);
        persArray[3] = new Person("Jonh", "MakJy.mail.ru", "chef", 71, 5233, 75723);
        persArray[4] = new Person("Rick", "GrDRick.blackHole.com", "Grand dad", 80, 0, 78834);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].println();
        }
    }
}

class Person {
    public String toString() {
        return String.format("Имя: %s  Должность: %s \nEmail: %s    Телефон: %d \n Зарплата: %d    Возраст: %d \n",
                name, post, email, number, salary, age);
}

    private String name;
    private String email;
    private String post;
    int age;
    private int salary;
    private int number;

    public Person(String name, String email, String post, int age, int salary, int number) {
        this.name = name;
        this.email = email;
        this.post = post;
        this.age = age;
        this.salary = salary;
        this.number = number;
    }

    public void println() {
        System.out.println(this);
    }
}

