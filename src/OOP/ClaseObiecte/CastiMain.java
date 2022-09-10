package OOP.ClaseObiecte;

public class CastiMain {
    public static void main(String[] args) {
          Casti a = new Casti("Negru", "Samson", true, true, 40, "Jack", 300);
        a.info();
          Casti a2 = new Casti("Alb", "IPhone");
        a2.info();
          Casti a3 = new Casti("Nokia", true, false);
        a3.info();
          Casti a4 = new Casti("Google", "USB-C", 210);
        a4.info();

    }
}
