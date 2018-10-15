package Lesson_2.dz2.SerdakovAU;


public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(Week.MONDAY.getWorkingHours());
    }

    public enum Week {
        MONDAY("40 часов"),
        TUESDAY("32 часа"),
        WEDNESDAY("24 часа"),
        THURSDAY("16 часов"),
        FRIDAY("8 часов"),
        SATURDAY("сегодня выходной"),
        SUNDAY("сегодня выходной");

        Week(String hours) {
            this.hours = hours;
        }

        private String hours;

        public String getWorkingHours() {
            return hours;
        }
    }
}

