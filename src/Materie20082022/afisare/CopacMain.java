package Materie20082022.afisare;

public class CopacMain {
    public static void main(String[] args) {
        Copac c = new Copac(10,200,"Confier","Gradina Botanica",false);
        c.infoCopac();
        c.infoCopacIncomplet();
        Copac c2 = new Copac(12,10,"Foioase", "Parcul Carol", true);
        c2.infoCopac();
        c2.infoCopacIncomplet();
    }
}