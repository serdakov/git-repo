package ru.geekbrains.java1.dz.dz2.SerdakovAU;

public class Main {
    public static void main(String[] args) {
        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        changeArray();
        System.out.println();
        fillDiagonal();
        minMaxArray();
        boolean b = checkBalance(new int[]{13, 11, 1, 20, 5});
        System.out.println(b);
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }

    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 2};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i + j == 9) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void minMaxArray() {
        int[] arr = {1, 5, 3, 2, 25, 4, 5, 2, 4, 0, 9, 2};
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число = " + max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= max) {
                min = arr[i];
                max = arr[i];
            }
        }
        System.out.println("Минимальное число = " + min);
    }

    public static boolean checkBalance(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int i = arr.length / 2;
        if (arr.length % 2 == 0) {
            for (int j = i; j < arr.length; j++) {
                sum2 += arr[j];
            }
            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }

        } else {
            for (int j = 0; j <= i; j++) {
                sum1 += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum2 += arr[j];
            }
        }

        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }
    }
}
