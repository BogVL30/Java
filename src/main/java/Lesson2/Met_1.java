package Lesson2;

public class Met_1 {
    public static void main(String[] args) {
        System.out.println(summa());
        summa();
    }
        public static boolean summa (){
        int a = 10;
        int b = 22;
        int sum = a+b;
        if(sum>10 && sum <=20){
            return true;
        } else {
            return false;
        }
        }
    }

