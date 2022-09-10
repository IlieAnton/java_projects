package Materie20082022.Conditii;

public class AutobusMain {
    public static void main(String[] args) {
        Autobus a = new Autobus(7,3);
        System.out.println(a.lungime);
        System.out.println(a.pret);

        Autobus a2 = new Autobus(7, "albastru");
        System.out.println(a2.lungime);
        System.out.println(a2.culoare);
    }
}
