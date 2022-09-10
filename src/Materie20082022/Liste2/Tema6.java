package Materie20082022.Liste2;

import java.util.ArrayList;

public class Tema6 {
    public static void main(String[] args) {
        int suma =0;
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        int nr = 0;
        int ni = 0;
        for (int i = 0; i <= n.size() - 1; i = i + 1) {
            if (n.get(i) % 2 == 0) {
                nr = i;
                break;
            }
        }
        for (int i1 = 0; i1 <= n.size() - 1; i1 = i1 + 1) {
            if (n.get(i1) % 2 == 0) {
                ni = i1;

            }
        }
        for (int e = nr; e <= ni; e =e+1) {
           suma = suma+n.get(e);
        }
        System.out.println(suma);
    }
}
