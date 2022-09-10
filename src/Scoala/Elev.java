package Scoala;

import java.util.ArrayList;

public class Elev {
    String nume;
    String prenume;
    int varsta;
    String clasa;
    ArrayList<Nota> note = new ArrayList<>();

    public Elev (String nume, String prenume, int varsta, String clasa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.clasa = clasa;
    }
    }
