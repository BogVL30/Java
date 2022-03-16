package Lesson4;

public class Cat extends Animals {


    public Cat(String name, int i) {
        super(name);
    }

    public void run(int run) {
        if (run <= 200)
            System.out.print("пробежал " + run + " метров, ");
    }

    public void swim(int swim) {
        System.out.println("Не умеет плавать( ");
    }
}



