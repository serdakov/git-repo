package Lesson_5;

public class MainMFU {
    static class MFU {
        Object printLock = new Object();
        Object scanLock = new Object();
        public void print(String doc, int n) {
            synchronized (printLock) {
                System.out.printf("Начало печати документа: %s\n", doc);
                for (int i = 0; i < n; i++) {
                    System.out.printf("Печатается страница %d\n", i);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("Завершение печати документа: %s\n", doc);
        }
        public void scan(String doc, int n) {
            synchronized (scanLock) {
                System.out.printf("Начало сканирования документа: %s\n", doc);
                for (int i = 0; i < n; i++) {
                    System.out.printf("Сканируется страница %d\n", i);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("Завершение сканирования документа: %s\n", doc);
        }
    }
    public static void main(String[] args) {
        MFU mfu = new MFU();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan("Doc #1", 5);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan("Doc #2", 6);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.print("Doc #1", 4);
            }
        }).start();
    }
}
