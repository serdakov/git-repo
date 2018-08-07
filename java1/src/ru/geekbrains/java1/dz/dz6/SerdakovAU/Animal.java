package ru.geekbrains.java1.dz.dz6.SerdakovAU;

public class Animal {
    protected String name;
    protected String color;
    protected int run;
    protected double jump;
    protected int swim;

    public Animal() {
    }

    public void run(int a) {
        if (a <= run && a > 0) {
            System.out.println("run: " + true);
        } else {
            System.out.println("run: " + false);
        }
    }

    public void jump(double a) {
        if (a <= jump && a > 0) {
            System.out.println("jump: " + true);
        } else {
            System.out.println("jump: " + false);
        }
    }

    public void swim(int a) {
        if (a <= swim && a > 0) {
            System.out.println("swim: " + true);
        } else {
            System.out.println("swim: " + false);
        }

    }
}


