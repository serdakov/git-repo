package ru.geekbrains.java1.dz.dz7.SerdakovAU;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Tony", 25, false);
        cat[1] = new Cat("Bucks", 25, false);
        cat[2] = new Cat("Ricky", 30, false);
        cat[3] = new Cat("Vision", 26, false);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].infoFill();
        }
        plate.addFood(100);
        plate.info();
    }
}
