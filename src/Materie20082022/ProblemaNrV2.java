package Materie20082022;

import java.util.ArrayList;
import java.util.Collections;

public class ProblemaNrV2 {
    public static void main(String[] args) {
        ArrayList<Integer> nr1 = new ArrayList<>();
        Collections.addAll(nr1, 1, 2, 3, 4, 5);
        ArrayList<Integer> nr2 = new ArrayList<>();
        Collections.addAll(nr2, 5, 4, 3, 2);
        for (int i = 0; i <= nr1.size() - 1; i = i + 1) {
            int nr = nr1.get(i);
            if (nr2.contains(nr) == false) {
                System.out.println("Numarul care lipseste este " + nr);
            }
        }
    }
}
