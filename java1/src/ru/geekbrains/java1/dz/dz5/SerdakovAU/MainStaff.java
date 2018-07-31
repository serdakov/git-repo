package ru.geekbrains.java1.lesson5;

public class MainStaff {
    public static void main(String[] args) {

        Staff[] staffs = new Staff[5];
        staffs[0] = new Staff("Петров Петр", "водитель", "petrov@mail.com", "89113212121", 15000, 35);
        staffs[1] = new Staff("Иванов Иван", "курьер", "ivanov@mail.com", "89214567889", 10000, 29);
        staffs[2] = new Staff("Балансова Ольга", "бухгалтер", "balansova@mail.com", "86516546794", 45000, 44);
        staffs[3] = new Staff("Босов Игорь", "директор", "boss@mail.com", "89217778899", 99000, 50);
        staffs[4] = new Staff("Засудов Станислав", "юрист", "zasudov@mail.com", "89563786159", 35000, 33);

        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i].getAge() > 40) {
                staffs[i].printInfo();
            }
        }
    }
}
