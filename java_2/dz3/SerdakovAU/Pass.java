package Lesson_3.dz3.SerdakovAU;

import java.util.Scanner;

public class Pass {
    public static void enterPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");
        String password = scanner.next();
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}";
        while (!password.matches(pattern)) {
            System.out.println("Введите пароль");
            password = scanner.next();
        }
    }
}
