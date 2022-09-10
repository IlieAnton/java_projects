package OOP.ClaseObiecte;

public class Desk1 {
    int pret;
    int nrpicioare;
    String material;
    Boolean eDurabil;
    int nrsertare;

    public Desk1(int pret, int nrpicioare, String material, Boolean eDurabil, int nrsertare) {
        this.pret = pret;
        this.nrpicioare = nrpicioare;
        this.material = material;
        this.eDurabil = eDurabil;
        this.nrsertare = nrsertare;
    }

    void destroy() {
        System.out.println("Biroul se autodistruge ....");
    }

    void build() {
        System.out.println("Biroul este construit");
    }

    void restore() {
        System.out.println("Biroul este restaurat");
    }

    void paint() {
        System.out.println("Biroul este pictat");
    }
}
