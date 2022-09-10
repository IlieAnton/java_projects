package Materie20082022.atribute;

public class Desk {
    String material;
    int pret;
    Boolean edurabil;
    int nrPicioare;
    int nrsertare;

    public Desk(String material, int pret, Boolean edurabil, int nrPicioare, int nrsertare) {
        this(material, pret, edurabil, nrPicioare);
        this.nrsertare = nrsertare;


    }

    public Desk(String material, int pret, Boolean edurabil, int nrPicioare) {
        this.material = material;
        this.pret = pret;
        this.edurabil = edurabil;
        this.nrPicioare = nrPicioare;
    }


}

