package OOP.ClaseObiecte;

public class Casti {
    String culoare;
    String brand;
    Boolean functieVolum;
    Boolean functiePauza;
    int lungimeCablu;
    String tipConector;
    int pret;

    public Casti(String culoare, String brand, Boolean functieVolum, Boolean functiePauza, int lungimeCablu, String tipConector, int pret) {
        this.culoare = culoare;
        this.brand = brand;
        this.functiePauza = functiePauza;
        this.functieVolum = functieVolum;
        this.lungimeCablu = lungimeCablu;
        this.tipConector = tipConector;
        this.pret = pret;
    }

    public Casti(String culoare, String brand) {
        this.culoare = culoare;
        this.brand = brand;
    }

    public Casti(String brand, Boolean functiePauza, Boolean functieVolum) {
        this.brand = brand;
        this.functiePauza = functiePauza;
        this.functieVolum = functieVolum;
    }

    public Casti(String brand, String tipConector, int pret) {
        this.brand = brand;
        this.tipConector = tipConector;
        this.pret = pret;

    }

    void info() {
        System.out.println("---------------------");
        System.out.println("culoare: " + culoare);
        System.out.println("brand: " + brand);
        System.out.println("functie pauza: " + functiePauza);
        System.out.println("functie volum: " + functieVolum);
        System.out.println("lungime cablu: " + lungimeCablu);
        System.out.println("tip conector: " + tipConector);
        System.out.println("pret: " + pret);
    }
}
