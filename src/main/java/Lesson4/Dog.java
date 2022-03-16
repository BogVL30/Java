package Lesson4;

public class Dog extends Animals {

    Dog(String name) {
        super(name);
    }


    public void run(int run) {
        if (run <= 500)
            System.out.print("Пробежал: " + run + " метров, ");
    }


    public void swim(int swim) {
        if (swim <= 10)
            System.out.println("Проплыл " + swim + " метров. ");
        else System.out.println(" Утонул(( ");
    }

}

