package ru.geekbrains.java1.dz.dz4.SerdakovAU;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static char[][] map = new char[3][3]; // игровое поле
    private static Scanner sc = new Scanner(System.in); // Scanner для чтения консоли
    private static Random rand = new Random(); // генератор случайных чисел

    public static void initMap() { // инициализируем массив map(игровое поле)
        for (int i = 0; i < map.length; i++) { // двойным циклом проходимся по всему массиву
            for (int j = 0; j < map.length; j++) {
                map[i][j] = '*'; // и заполняем каждую ячейку *
            }
        }
//        map[0][0] = '*';
//        map[0][1] = '*';
//        map[0][2] = '*';
//        map[1][0] = '*';
//        map[1][1] = '*';
//        map[1][2] = '*';
//        map[2][0] = '*';
//        map[2][1] = '*';
//        map[2][2] = '*';
    }

    public static void printMap() { // выводим игровое поле в консоль
        System.out.println("  1 2 3"); // первая строка с координатами
        for (int i = 0; i < map.length; i++) { // начинаем печатать поле
            System.out.print((i + 1) + " "); // ставим номер строки 1-3
            for (int j = 0; j < map.length; j++) { // начинаем печатать строку
                System.out.print(map[i][j] + " "); // посимвольно печатаем содержимое каждой ячейки поля
            }
            System.out.println(); // после распечатки строки, делаем перевод каретки
        }
        System.out.println(); // делаем дополнительный перевод строки
    }

    public static void main(String[] args) {
        initMap(); // инициализируем поле
        printMap(); // печатаем в консоль

        while (true) { // запускаем игровой цикл
            humanTurn(); // ход человека
            printMap(); // печать поля
            if (isCheckWin1('X') || isCheckWin2('X')) { // проверка победы человека
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) break; // если поле заполнилось, завершаем игру
            aiTurn(); // ход компьютера
            printMap(); // печать поля
            if (isCheckWin1('O') || isCheckWin2('O')) { // проверка победы компьютера
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("Game Over");
    }


    public static boolean isCheckWin1(char c) { // Проверяем победу по диагоналям
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i=0; i<map.length; i++) {
            toright &= (map[i][i] == c);
            toleft &= (map[map.length-i-1][i] == c);
        }

        if (toright || toleft) return true;

        return false;
    }

    public static boolean isCheckWin2(char c) { // Проверяем победу по строкам или столбцам
        boolean cols, rows;
        for (int i=0; i<map.length; i++) {
            cols = true;
            rows = true;
            for (int j=0; j<map.length; j++) {
                cols &= (map[i][j] == c);
                rows &= (map[j][i] == c);
            }
            if (cols || rows) return true;
        }
        return false;
    }

    private static void humanTurn() { // ход человека
        int x, y;
        do {
            System.out.println("Введите координаты в формате Х и У");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;


        } while (!isCellEmpty(x, y)); // пользователь вводит координаты до тех пор, пока не укажет на свободную ячейку
        map[y][x] = 'X'; // после чего ставим туда Х
    }

    private static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == '*') return false; // если на поле нашли хотя бы одну *, значит поле еще не заполнилось
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do { // компьютер пытается случайно выбрать незанятое поле для хода
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isCellEmpty(x, y));
        map[y][x] = 'O'; // как только ячейка найдена, ставим туда О
    }
//x 0 1 2

    //    y
//    0
//    1
//    2
    public static boolean isCellEmpty(int x, int y) { // проверка является ли ячейка свободной
        if (x < 0 || x > 2 || y < 0 || y > 2) return false; // если указаны неверные координаты, считаем что ячейка условно занята
        if (map[y][x] != '*') return false; // если в ячейке не *, значит занята
        return true; // ячейка свободна
    }
}
