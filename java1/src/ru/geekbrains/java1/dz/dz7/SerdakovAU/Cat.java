package ru.geekbrains.java1.dz.dz7.SerdakovAU;

public class Cat {
    private String name;
    private int appetite;
    private boolean fill;

    public Cat(String name, int appetite, boolean fill) {
        this.name = name;
        this.appetite = appetite;
        this.fill = fill;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println("Коту " + name + " не хватает еды");
        } else {
            p.decreaseFood(appetite);
            setFill(true);
        }

    }

    public void infoFill() {
        System.out.println("Сытость: " + name + " " + fill);
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
