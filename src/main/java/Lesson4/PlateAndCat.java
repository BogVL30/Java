package Lesson4;

public class PlateAndCat {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        plate.info();

        Cat[] Cat = new Cat[3];
        Cat[0] = new Cat("Roni", 15, false);
        Cat[1] = new Cat("Jeck", 10, false);
        Cat[2] = new Cat("Arni", 20, false);

        for (int i = 0; i < Cat.length; i++) {
            if (Cat[i].appetite <= plate.food) {
                Cat[i].eat(plate);
                Cat[i].Up = true;
                System.out.println("Кот " + Cat[i].name + " съел " + Cat[i].appetite + " еды.");
                plate.info();
            } else {
                System.out.println("Кот " + Cat[i].name + " хотел съесть " + Cat[i].appetite + " еды");
            }
        }

        plate.info();
        plate.increaseFood(20);
        plate.info();

        System.out.println();
        System.out.println("Cытость котов:");
        for (int i = 0; i < Cat.length; i++) {
            System.out.println("Кот " + Cat[i].name + ", сытость: " + Cat[i].Up);
        }
    }

    public static class Cat {
        public String name;
        public int appetite;
        public boolean Up = false;


        public Cat(String name, int appetite, boolean Up) {
            this.name = name;
            this.appetite = appetite;
            this.Up = false;
        }

        public void eat(Plate plate) {
            plate.decreaseFood(appetite);
        }
    }

    public static class Plate {
        public int food;

        public Plate(int food) {
            this.food = food;
        }

        public void info() {
            System.out.println("Еды в тарелке: " + food);
        }

        public void decreaseFood(int n) {
            food -= n;
        }

        public void increaseFood(int n) {
            food += n;
            System.out.println("Добавили " + n + " еды.");
        }
    }

}



