package ru.geekbrains.java1.dz.dz6.SerdakovAU;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tony", "grey", 200, 2, 0);
        Dog dog1 = new Dog("Jay", "White", 500, 0.5, 10);

        dog1.run(800);
        cat1.run(100);

        dog1.swim(10);
        cat1.swim(10);

        dog1.jump(0.4);
        cat1.jump(1.5);

    }
}
