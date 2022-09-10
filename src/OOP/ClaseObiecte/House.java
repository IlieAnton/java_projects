package OOP.ClaseObiecte;

public class House {
    String zona;
    int nrCamere;
    Boolean areEtaj;

    public House(String zona, int nrCamere, Boolean areEtaj) {
        this.zona = zona;
        this.nrCamere = nrCamere;
        this.areEtaj = areEtaj;
    }

    void build() {
        System.out.println("In " + (zona) + " se construieste o casa");
    }

    void sell() {
        System.out.println("In " + (zona) + " se vinde o casa cu " + nrCamere + " camere");
    }

    void clean() {
        System.out.println("Proprietarii fac curat in casa");
    }

    void restore() {
        System.out.println("Casa fara etaj este restaurata");
    }

    void paint() {
        System.out.println("Casa este zugravita");
    }
}
