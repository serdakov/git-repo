package ru.geekbrains.java1.lesson5;

public class Staff {
    private String name;
    private String post;
    private String mail;
    private String phone;
    private int money;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public int getMoney() {
        return money;
    }

    public void printInfo() {System.out.println("ФИО: " + name + " должность: " + post + " email: " + mail + " телефон: " + phone + " зарплата: " + money + " возраст: " + age);}

public Staff() {
    name = "Неизвестно";
    post = "Неизвестно";
    mail = "Неизвестно";
    phone = "Неизвестно";
    money = 0;
    age = 0;
}

public Staff(String name, String post, String mail, String phone, int money, int age) {
    this.name = name;
    this.post = post;
    this.mail = mail;
    this.phone = phone;
    this.money = money;
    this.age = age;
}
}
