package Lesson2.ScannerSc;

import java.io.InputStream;

public class Scanner {
    public Scanner(InputStream in) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0) {
            System.out.println("Число отрицательное ");
        } else {
            System.out.println("Число положительное ");
        }
    }

    public static int nextInt() {
        return 0;
    }
}

