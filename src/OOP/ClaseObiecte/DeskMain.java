package OOP.ClaseObiecte;

import Materie20082022.Clasaobiect.Desk;

public class DeskMain {
    public static void main(String[] args) {
        Desk1 a = new Desk1(100, 4, "Lemn", true, 2);
        a.destroy();
        a.build();
        a.restore();
        a.paint();
    }
}
