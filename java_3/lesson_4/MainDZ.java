package Lesson_5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainDZ {
    public static void main(String[] args) throws FileNotFoundException {
        class TextWriter implements Runnable {
            private PrintWriter pw;
            private int x;
            public TextWriter(PrintWriter pw, int x) {
                this.pw = pw;
                this.x = x;
            }
            @Override
            public void run() {
                for (int i = 0; i < x; i++) {
                    try {
                        Thread.sleep(20);
                        pw.println(i);
                        pw.flush();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("123/1.txt");
            Thread t1 = new Thread(new TextWriter(pw, 5));
            Thread t2 = new Thread(new TextWriter(pw, 7));
            Thread t3 = new Thread(new TextWriter(pw, 2));
            try {
                t1.start();
                t2.start();
                t3.start();
                t1.join();
                t2.join();
                t3.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }
}
