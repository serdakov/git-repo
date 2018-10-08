package Lesson_1.java_2.dz1.SerdakovAU;

public class Main {
    public static void main(String[] args) {
        Human[] humans_1 = new Human[4];
        humans_1[0] = new Human("Патрик", 1, 500, 350);
        humans_1[1] = new Human("Антон", 2, 330, 375);
        humans_1[2] = new Human("Витя", 1, 550, 200);
        humans_1[3] = new Human("Павел", 2, 300, 250);

        Human[] humans_2 = new Human[4];
        humans_2[0] = new Human("Стив", 2, 450, 325);
        humans_2[1] = new Human("Мика", 1, 300, 275);
        humans_2[2] = new Human("Пекка", 2, 375, 225);
        humans_2[3] = new Human("Антти", 2, 200, 350);

        Team team_1 = new Team("СКА", humans_1);
        Team team_2 = new Team("Йокерит", humans_2);

        Course course = new Course(400, 1, 300);

        course.doIt(team_1);
        course.doIt(team_2);
        team_1.showResult();
        team_2.showResult();
        System.out.println();
        team_1.showInfo();
        System.out.println();
        team_2.showInfo();
    }
}
