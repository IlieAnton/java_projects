package Materie20082022;

import java.util.ArrayList;
import java.util.Collections;

public class ListaString {
    public static void main(String[] args) {
        int b = 0;
        ArrayList<String> a = new ArrayList<String>();
        Collections.addAll(a, "a", "c", "d");
        for (int i = 0; i <= a.size() - 1; i = i + 1) {
            if (a.contains("c")) {
                b = b + 1;
            }
        }
        if (b == 4) {
            System.out.println("Lista il contine pe c");
        } else {
            System.out.println("Lista nu il contine pe c");
        }
    }
}
