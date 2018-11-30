package lesson_2;

import java.sql.*;
import java.util.Scanner;

public class MainDB {

    private static Connection connection;
    private static Statement stmt;

    public static void main(String[] args) {

        try {
            connect();
            createTable();
            fillTable();

            Scanner scanner = new Scanner(System.in);

            while (true) {

                String str = scanner.nextLine();
                String[] arr = str.split(" ");

                if (arr[0].equals("цена")) {
                    try {
                        searchPrice(arr[1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                } else if (arr[0].equals("сменитьцену")) {
                    try {
                        updatePrice(arr[1], arr[2]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                } else if (arr[0].equals("товарыпоцене")) {
                    try {
                        searchGoods(arr[1], arr[2]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                } else if (arr[0].equals("выход")) {
                    System.out.println("Quit");
                    break;
                } else {
                    System.out.println("Команда не найдена");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable() throws SQLException {
        stmt.execute("CREATE TABLE if not exists goods (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "prodid TEXT UNIQUE," +
                "title TEXT," +
                "cost INTEGER)");
    }

    public static void fillTable() throws SQLException {
        stmt.execute("DELETE FROM goods");
        connection.setAutoCommit(false);
        for (int i = 1; i <= 10000; i++) {
            String req = String.format("insert into goods (prodid, title, cost) values ('%s', 'товар%s', '%s')", i, i, i * 10);
            stmt.execute(req);
        }
        connection.setAutoCommit(true);
    }

    public static void searchPrice(String s) throws SQLException {
        ResultSet rs = stmt.executeQuery("select cost from goods where title ='" + s + "'");
        if (!rs.next()) {
            System.out.println("нет совпадений");
        } else {
            System.out.println(rs.getInt("cost"));
        }
    }

    public static void updatePrice(String s, String q) throws SQLException {
        stmt.executeUpdate("update goods set cost = '" + q + "' where title = '" + s + "'");
    }

    public static void searchGoods(String a, String b) throws SQLException {
        ResultSet rs = stmt.executeQuery("select title from goods where cost between " + a + " " +
                "and " + b + "");
        while (rs.next()) {
            System.out.println(rs.getString("title"));
        }
    }
}
