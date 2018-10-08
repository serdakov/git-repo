package Lesson_1.java_2.dz1.SerdakovAU;

public class Team {
    String name;
    Human[] humans;

    public Team(String name, Human[] humans) {
        this.name = name;
        this.humans = humans;
    }

    public void showResult() {
        for (Human human : humans) {
            if (human.isSuccess()) {
                System.out.print("Команда " + name + " ");
                human.successInfo();
            }
        }
    }

    public void showInfo() {
        for (Human human : humans) {
            System.out.print("Команда " + name + " ");
            human.playerInfo();
        }
    }
}
