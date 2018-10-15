package Lesson_2.dz2.SerdakovAU;

import java.util.Random;

public class MainX {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] arr1 = new String[5][4];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = String.valueOf(random.nextInt(10));
            }
        }
//        arr1[1][2] = "буквы";
        try {
            int sum = Exception.sumArray(arr1);
            System.out.println(sum);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}




