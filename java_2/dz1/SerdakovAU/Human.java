package Lesson_1.java_2.dz1.SerdakovAU;

public class Human {
    boolean isSuccess;
    String name;
    int maxJumpHeight;
    int maxRunDistance;
    int maxSwimDistance;

    public Human(String name, int maxJumpHeight, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    boolean isSuccess() {
        return isSuccess;
    }

    void successInfo() {
        System.out.println(name + " Прошёл дистанцию");
    }

    void playerInfo() {
        System.out.println(name + " макс.выота: " + maxJumpHeight + " макс.кросс: " + maxRunDistance + " макс.заплыв: " + maxSwimDistance);
    }
}
