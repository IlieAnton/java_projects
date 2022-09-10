package Materie20082022.Clasaobiect;

public class CaracteristiciPenar {
    public static void main(String[] args) {
        Penar a = new Penar();
        a.culoare = "Verde";
        a.adouaculoare = "Galben";
        a.continut = "creioane, pixuri";
        a.nrcontinut = 13;
        System.out.println(a.culoare);
        System.out.println(a.adouaculoare.toUpperCase());
        System.out.println(a.continut);
        System.out.println(a.nrcontinut * 2);
    }
}
