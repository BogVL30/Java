package Lesson6;

public class Massiv {
    public static void main(String[] args) {
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"2", "3", "4", "5"},
                {"3", "4", "5", "6"},
                {"4", "5", "6", "7"}
        };
        String[][] incorrectSize = {
                {"1", "2", "3"},
                {"2", "3", "4"},
                {"3", "4", "5"},
                {"4", "5", "6"}
        };
        String[][] incorrectData = {
                {"1", "2", "3", "4"},
                {"2", "df", "4", "5"},
                {"3", "4", "5", "6"},
                {"4", "5", "6", "7"}
        };

        try {
            Massiv.stringExceptionTest(correct);
            Massiv.stringExceptionTest(incorrectSize);

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(sum(correct));
            System.out.println(sum(incorrectData));
        } catch (MyArrayDataException exception) {
            exception.printStackTrace();
        }
    }

    public static void stringExceptionTest(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов "));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static int sum(String[][] matrix) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

}

