package ru.geekbrains.java1.dz.dz1.serdakov.au;

public class Main {
    public static void main(String[] args) {
        byte a = 10;
        System.out.println("a = " + a);

        short b = 2404;
        System.out.println("b = " + b);

        int c = 200000;
        System.out.println("c = " + c);

        long d = 15000L;
        System.out.println("d = " + d);

        float e = 120.4f;
        System.out.println("e = " + e);

        double f = 12.72775;
        System.out.println("f = " + f);

        boolean g = true;
        System.out.println("g = " + g);

        char h = 'H';
        System.out.println("h = " + h);

        int i = math(2, 3, 4, 1);
        System.out.println("a * (b + (c / d)) = " + i);

        boolean j = math4(10, 9);
        System.out.println(j);

        math5(-15);

        boolean k = isNegative(-5);
        System.out.println(k);

        name7("Тони");

        year8(2400);

    }

    public static int math(int a, int b, int c, int d) {
        int x = a * (b + (c / d));
        return x;
    }

    public static boolean math4(int a, int b) {
        int y = a + b;
        if (y > 10 && y <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void math5(int a) {
        if (a >= 0) {
            System.out.println("Вы передали положительное число");
        } else {
            System.out.println("Вы передали отрицательное число");
        }
    }

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void name7(String a) {
        System.out.println("Привет, " + a + "!");
    }

    public static void year8(int year) {
        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println("Год високосный");
        } else{
            System.out.println("Год не високосный");
        }
    }
}

