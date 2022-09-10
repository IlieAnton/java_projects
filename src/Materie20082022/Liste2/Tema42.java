package Materie20082022.Liste2;

import java.util.ArrayList;

public class Tema42 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(3);
        a.add(7);
        int max = a.get(0);
        int min = a.get(0);
        for (int i = 0; i <= a.size()-1; i=i+1) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
               if (a.get(i) < min) {
                min = a.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
