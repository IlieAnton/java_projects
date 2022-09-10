package Materie20082022.afisare;

public class Liste {
    public static void main(String[] args) {

        Copac a = new Copac(10, 6000, "Conifer", "Predeal", false);
        Copac b = new Copac(100, 6, "Conifer", "SUA", false);
        Copac c = new Copac(1, 1, "Conifer", "Oriunde", false);
        Copac d = new Copac(10, 6000, "Foioase", "Gradina Botanica", true);
        Copac e = new Copac(1000000, 600000, "Conifer", "Tibet", true);
        Copac f = new Copac(2, 12, "Conifer", "Predeal", false);
        Copac g = new Copac(10, 6000, "Conifer", "Predeal", false);
        Copac h = new Copac(10, 6000, "Conifer", "Predeal", false);

        Copac[] copaci = {a, b, c, d, e, f, g, h};
        for (int i = 0; i <= copaci.length - 1; i = i + 1) {
            //   System.out.println(copaci[i].grupa);
            if (copaci[i].inaltime == 10) {
                System.out.println(copaci[i].locatie);
                System.out.println(copaci[i].grupa);
            }
        }
        int copacinr = 0;
        System.out.println("Numarul de copaci cu varsta mai mica decat 10");
        for (int i = 0; i <= copaci.length - 1; i = i + 1) {
            if (copaci[i].varsta < 10) {
                copacinr = copacinr + 1;
            }
        }
        System.out.println("Unde sunt coniferele?");
        for (int i = 0; i <= copaci.length - 1; i = i + 1) {
            if (copaci[i].grupa.equals("Conifer")) {
                System.out.println(copaci[i].locatie);
            }
        }
        int aufructe = 0;
        int naufructe = 0;
        System.out.println("Cati copaci sunt si de ce fel???");
        for (int i = 0; i <= copaci.length - 1; i = i + 1) {
            if (copaci[i].fructe == false) {
                naufructe = naufructe + 1;
            } else {
                aufructe = aufructe + 1;
            }
        }
        System.out.println("Au fructe: " + aufructe);
        System.out.println("N-au fructe: " + naufructe);
        //  System.out.println(copacinr);
    }
}
