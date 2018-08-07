package ru.geekbrains.java1.dz.dz6.SerdakovAU;

public class Cat extends Animal {
    public Cat(String name, String color, int run, double jump, int swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    @Override
    public void swim(int a) {
        System.out.println("Кот не умеет плавать");
    }
}
