package OOP.ClaseObiecte;

public class DeskMain {
    public static void main(String[] args) {
        Desk1 a = new Desk1(100, 4, "Lemn", true, 2);
        a.destroy();
        a.build();
        a.restore();
        a.paint();
    }
}
