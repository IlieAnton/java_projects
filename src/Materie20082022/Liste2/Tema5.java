package Materie20082022.Liste2;

import java.util.ArrayList;

public class Tema5 {
    public static void main(String[] args) {
        int nri = 0;
        int nrp = 0;
        ArrayList<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(7);
        n.add(3);
        n.add(6);
        n.add(5);
        for (int i = 0; i <= n.size() - 1; i=i+1) {
            if (n.get(i) % 2 == 0) {
                nrp = nrp + n.get(i);
            } else {
                nri = nri + n.get(i);
            }
        }

    }
}
