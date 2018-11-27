package Lesson_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Main {

    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void main(String[] args)  {

        try {
            connect();
            //ResultSet rs = stmt.executeQuery("SELECT * FROM students");

//            connection.setAutoCommit(false);
//            pstmt = connection.prepareStatement("INSERT INTO students ( name, score,  faculty)\n" +
//                    "VALUES  (?,?,?)");
//
//            for (int i = 0; i < 1000; i++) {
//                pstmt.setString(1, "Bob " + i);
//                pstmt.setInt(2, i);
//                pstmt.setString(3, "gg");
//                pstmt.addBatch();
//            }


    stmt.executeUpdate("INSERT INTO students ( name, score,  faculty) VALUES ('Bob1', 10, 'gg')");
    Savepoint spt = connection.setSavepoint();

    stmt.executeUpdate("INSERT INTO students ( name, score,  faculty) VALUES ('Bob2', 20, 'gg')");
    connection.rollback(spt);

    connection.setAutoCommit(true);
    stmt.executeUpdate("INSERT INTO students ( name, score,  faculty) VALUES ('Bob3', 30, 'gg')");



//
//            pstmt.executeBatch();
//            connection.setAutoCommit(true);


            //stmt.executeUpdate("DROP TABLE IF EXISTS test");


//            connection.setAutoCommit(false);
//            long t = System.currentTimeMillis();
//
//
//            for (int i = 0; i < 1000; i++) {
//                stmt.executeUpdate("\n" +
//                        "INSERT INTO students ( name, score,  faculty)\n" +
//                        "VALUES  ('unknow', 100, 'yy')");
//            }
//
//            System.out.println(System.currentTimeMillis() - t);
//            connection.setAutoCommit(true);

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        stmt = connection.createStatement();

    }

    public static void disconnect() throws SQLException {
        connection.close();
    }
}


//
//class W extends JFrame {
//    public W() {
//        setTitle("PS");
//        JPanel panel = new JPanel(new GridLayout(1,2));
//        setBounds(400,400,400,400);
//        final JTextField jtf = new JTextField();
//        JButton btn1 = new JButton("send");
//
//        panel.add(jtf);
//        panel.add(btn1);
//
//        btn1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                final String res = jtf.getText();
//                Main.start(res);
//            }
//        });
//
//        add(panel, BorderLayout.NORTH);
//        setVisible(true);
//    }
//}
//
//class Start {
//    public static void main(String[] args) {
//        new W();
//    }
//}



















