package Materie20082022.Clasaobiect;

public class Caracteristici {
    public static void main(String[] args) {
        Persoana x = new Persoana();
        x.nume = "Nedea";
        x.prenume = "Ilie";
        x.varsta = 12;
        x.ocupatie = "Scolar";
        x.frati = 0;
        System.out.println(x.nume + " " + x.prenume);
        System.out.println(x.prenume);
        System.out.println(x.varsta);
        System.out.println(x.ocupatie);
        System.out.println(x.frati);
    }
}
