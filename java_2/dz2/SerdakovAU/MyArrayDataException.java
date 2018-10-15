package Lesson_2.dz2.SerdakovAU;

public class MyArrayDataException extends RuntimeException {
    private String msg;
    int row, column;
    public MyArrayDataException(String msg, int row, int column) {
        this.row = row;
        this.column = column;
        this.msg = msg;
    }
    @Override
    public String toString() {
        return msg + " " + row + " "  + column;
    }
}
