package Lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Fruit {
    public static void main(String args[]) {

        Integer[] array = new Integer[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println("Массив до: " + Arrays.toString(array));
        swapElements(array, 0, 1);
        System.out.println("Меняем два элемента массива местами: " + Arrays.toString(array));

        ArrayList<Integer> arrayList = arrToArrayList(array);
        System.out.println("-------------------------------------------------------------");

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Orange box1 weight: " + orange1Weigth);
        System.out.println("Orange box2 weight: " + orange2Weigth);
        System.out.println("Apple box weight: " + appleWeigth);

        System.out.println("Compare orangeBox1 & appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Compare orangeBox2 & appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static void swapElements(Object[] _array, int num1, int num2) {
        Object t = _array[num1];
        _array[num1] = _array[num2];
        _array[num2] = t;
    }

    private static <T> ArrayList<T> arrToArrayList(T[] _array) {
        return new ArrayList<T>(Arrays.asList(_array));
    }

    private float weight;

    Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

}
