package Materie20082022.Liste2;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Me");
        list.add("You");
        list.add("Him");
        System.out.println(list);

        // ex 1
        int l = list.size() - 1;
        System.out.println(list.get(l));
        System.out.println("ex 2-------------------------");

        // ex 2
        for (int i = 0; i <= l; i = i + 1) {
            System.out.println(list.get(i));
        }

    }
}
