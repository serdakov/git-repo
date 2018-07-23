package ru.geekbrains.java1.dz.dz3.SerdakovAU;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            guessNumber();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
        }

    }

    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10);
        int n = 1;
        while (n < 4) {
            System.out.println("Угадайте число от 0 до 9");
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
                n++;
                if (n == 4) {
                    System.out.println("Вы проиграли");
                }
            } else {
                System.out.println("Загаданное число больше");
                n++;
                if (n == 4) {
                    System.out.println("Вы проиграли");
                }
            }
        }
    }

}
