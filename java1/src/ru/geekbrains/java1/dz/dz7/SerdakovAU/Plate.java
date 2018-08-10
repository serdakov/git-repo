package ru.geekbrains.java1.dz.dz7.SerdakovAU;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood(int n) {
        food += n;
    }

    public void info() {
        if (food == 0) {
            System.out.println("В миске закончилась еда");
        } else {
            System.out.println("plate:" + food);
        }
    }

    public int getFood() {
        return food;
    }
}
