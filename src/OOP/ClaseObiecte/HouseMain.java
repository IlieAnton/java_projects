package OOP.ClaseObiecte;

public class HouseMain {
    public static void main(String[] args) {
        House a = new House("Bucuresti", 6, false);
        a.build();
        a.sell();
        a.clean();
        a.restore();
        a.paint();
    }
}
