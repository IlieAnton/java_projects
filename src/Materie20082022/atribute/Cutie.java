package Materie20082022.atribute;

public class Cutie {
    String material;
    int pret;
    String continut;
    Boolean durabilitate;
    int lungime;
    int latime;
    int inaltime;

    public Cutie(String material, int pret, String continut, Boolean durabilitate, int lungime, int latime, int inaltime) {
        this(material,pret,continut,durabilitate,lungime,latime);
        this.inaltime = inaltime;


    }

    public Cutie(String material, int pret, String continut, Boolean durabilitate, int lungime, int latime) {
        this(material,pret,continut,durabilitate,lungime);
        this.latime = latime;
    }

    public Cutie(String material, int pret, String continut, Boolean durabilitate, int lungime) {
        this(material,pret,continut,durabilitate);
        this.lungime = lungime;
    }

    public Cutie(String material, int pret, String continut, Boolean durabilitate) {
        this(material,pret,continut);
        this.durabilitate = durabilitate;
    }

    public Cutie(String material, int pret, String continut) {
        this(material, pret);
        this.continut = continut;
    }
    public Cutie(String material, int pret) {
        this.material = material;
        this.pret = pret;
    }
    public Cutie(String material) {
        this.material = material;
    }
}

