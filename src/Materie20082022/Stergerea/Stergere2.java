package Materie20082022.Stergerea;

import java.util.ArrayList;
import java.util.Collections;

public class Stergere2 {
    public static void main(String[] args) {
        ArrayList<String> obiecte = new ArrayList<>();
        Collections.addAll(obiecte, "masa", "creion", "pix");
        System.out.println(obiecte);
        //int pozitie =0;
        String cuvant = "creion";
        System.out.println(obiecte.indexOf(cuvant));
        obiecte.remove(cuvant);
        System.out.println(obiecte);
    }
}
