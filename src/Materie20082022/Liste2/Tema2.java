package Materie20082022.Liste2;

import java.util.ArrayList;

public class Tema2 {
    public static void main(String[] args) {
        ArrayList<Integer> nr = new ArrayList();
        nr.add(1);
        nr.add(2);
        nr.add(3);
        nr.add(4);
        nr.add(5);
        nr.add(6);
        int l = nr.size()-1;
        System.out.println(nr.get(0));
        System.out.println(nr.get(l));
        System.out.println(nr.get(1));
        System.out.println(nr.get(l-1));
        System.out.println(nr.get(2));
        System.out.println(nr.get(l-2));

    }
}
