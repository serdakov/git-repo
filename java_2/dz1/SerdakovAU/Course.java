package Lesson_1.java_2.dz1.SerdakovAU;

public class Course {
    private int cross;
    private int wall;
    private int water;

    public Course(int cross, int wall, int water) {
        this.cross = cross;
        this.wall = wall;
        this.water = water;
    }

    void doIt(Team team) {
        for (Human human : team.humans) {
            if (human.maxJumpHeight >= wall && human.maxRunDistance >= cross && human.maxSwimDistance >= water) {
                human.isSuccess = true;
            }
        }
    }
}
