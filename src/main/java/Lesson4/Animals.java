package Lesson4;

public class Animals {
    protected String name;


    Animals(String name) {
        this.name = name;

    }

    public void run(int run) {
        System.out.print(" пробежал: ");
    }

    public void swim(int swim) {
        System.out.print(" проплыл: ");
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Cat catRoki = new Cat("Roki ", 50);
        System.out.print(catRoki);
        catRoki.run(150);
        catRoki.swim(0);

        Cat catBarsik = new Cat("Barsik ", 50);
        System.out.print(catBarsik);
        catBarsik.run(180);
        catBarsik.swim(0);

        Dog dogArnold = new Dog("Arnold ");
        System.out.print(dogArnold);
        dogArnold.run(420);
        dogArnold.swim(8);

        Dog dogMotya = new Dog("Motya ");
        System.out.print(dogMotya);
        dogMotya.run(500);
        dogMotya.swim(9);
    }

}




