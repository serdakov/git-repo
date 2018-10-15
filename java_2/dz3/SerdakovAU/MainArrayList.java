package Lesson_3.dz3.SerdakovAU;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("апельсин");
        al.add("яблоко");
        al.add("мандарин");
        al.add("киви");
        al.add("арбуз");
        al.add("манго");
        al.add("арбуз");
        al.add("манго");
        al.add("дыня");
        al.add("виноград");
        al.add("кокос");
        al.add("киви");
        al.add("кокос");
        Set<String> uniqueWord = new HashSet<>(al);
        System.out.println(uniqueWord);
        for (String x : uniqueWord) {
            System.out.println("Слово " + x + ": " + Collections.frequency(al, x));
        }
    }
}
