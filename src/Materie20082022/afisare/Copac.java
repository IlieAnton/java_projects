package Materie20082022.afisare;

public class Copac {
    int inaltime;
    int varsta;
    String grupa;
    String locatie;
    Boolean fructe;

    public Copac(int inaltime, int varsta, String grupa, String locatie, Boolean fructe) {
        this.inaltime = inaltime;
        this.varsta = varsta;
        this.grupa = grupa;
        this.locatie = locatie;
        this.fructe = fructe;
    }

    void infoCopac() {
        System.out.println("------------------------");
        System.out.println("infaltime: " + inaltime);
        System.out.println("varsta: " + varsta);
        System.out.println("grupa: " + grupa);
        System.out.println("locatie:" + locatie);
        System.out.println("fructe" + fructe);
        System.out.println("------------------------");

    }

    void infoCopacIncomplet() {
        System.out.println("======================");
        System.out.println("grupa: " + grupa);
        System.out.println("fructe: " + grupa);
        System.out.println("======================");
    }
}
