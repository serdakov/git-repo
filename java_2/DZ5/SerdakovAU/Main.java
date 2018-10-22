package Lesson_5.DZ5.SerdakovAU;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {

        oneThread();
        twoThread();
    }

    public static void twoThread() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long before = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

    public static void oneThread() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long before = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
