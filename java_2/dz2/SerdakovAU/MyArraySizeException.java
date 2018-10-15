package Lesson_2.dz2.SerdakovAU;

class MyArraySizeException extends RuntimeException {
    private String msg;

    public MyArraySizeException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
