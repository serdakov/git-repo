package ru.geekbrains.java1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static char[][] map = new char[5][5];
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void initMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = '*';
            }
        }
    }

    public static void printMap() {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isCheckWin('X')) {
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) break;
            aiTurn();
            printMap();
            if (isCheckWin('O')) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("Game Over");
    }


    public static boolean isCheckWin1(char c, int offsetI, int offsetJ) { // Проверяем победу по диагоналям
        boolean toright, toleft;                                          // в квадрате 4х4 со смещением
        toright = true;
        toleft = true;
        for (int i=0; i<4; i++) {

            toright &= (map[i+offsetI][i+offsetJ] == c);
            toleft &= (map[4-i-1+offsetI][i+offsetJ] == c);
        }

        if (toright || toleft) return true;

        return false;
    }

    public static boolean isCheckWin2(char c, int offsetI, int offsetJ) { // Проверяем победу по строкам или столбцам
        boolean cols, rows;                                               // в квадрате 4х4 со смещением
        for (int i=offsetI; i<4+offsetI; i++) {
            cols = true;
            rows = true;
            for (int j=offsetJ; j<4+offsetJ; j++) {
                cols &= (map[i][j] == c);
                rows &= (map[j][i] == c);
            }
            if (cols || rows) return true;
        }
        return false;
    }

    public static boolean isCheckWin(char c) {  // перебираем координаты квадрата 4х4 в квадрате 5х5
        for (int i=0; i<2; i++) {   // и передаем их в методы проверки победы по диагоналям или строкам/столбцам
            for (int j=0; j<2; j++) {
                if (isCheckWin1(c, i, j) || isCheckWin2(c, i, j)) return true;
            }
        }
        return false;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате Х и У");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;


        } while (!isCellEmpty(x, y));
        map[y][x] = 'X';
    }

    private static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == '*') return false;
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(5);
            y = rand.nextInt(5);
        } while (!isCellEmpty(x, y));
        map[y][x] = 'O';
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x > 4 || y < 0 || y > 4) return false;
        if (map[y][x] != '*') return false;
        return true;
    }


}

