package Lesson_2.dz2.SerdakovAU;

public class Exception {
    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер матрицы не 4х4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Размер матрицы не 4х4");
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt((arr[i][j]));
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В массиве не число", i, j);
                }
            }


        }
        return sum;
    }
}
