package Materie20082022.Stergerea;

import java.util.ArrayList;
import java.util.Collections;

public class Stergere1 {
    public static void main(String[] args) {
        int pozitie = -1;
        int s = 12;
        ArrayList<Integer> n = new ArrayList<>();
        Collections.addAll(n, 5,7,8,1,3);
        System.out.println(n);
        for (int i = 0; i <= n.size()-1; i=i+1) {
            if (n.get(i) == s) {
            pozitie = i;
            }
        }
        if (pozitie < 0) {
            System.out.println("Numarul nu exista");
        }else {
            n.remove(pozitie);
        }
        System.out.println(pozitie);
        System.out.println(n);

    }
}
