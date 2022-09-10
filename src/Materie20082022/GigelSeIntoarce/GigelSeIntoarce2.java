package Materie20082022.GigelSeIntoarce;

public class GigelSeIntoarce2 {
    public static void main(String[] args) {
        String Nume[] = {"Marius","Adi", "Materie20082022/Gigel", "Andrei", "George","Miriam" };
        int nr = Nume.length-1;
        int gigelPozitie = 0;
        int mariusPoszitie = 0;
        for (int i = 0; i <= nr; i=i+1) {
            if (Nume[i].equals("Materie20082022/Gigel")) {
                gigelPozitie = i;
            }
            if (Nume[i].equals("Marius")) {
                mariusPoszitie = i;
            }
        }
        if (gigelPozitie + 1  == mariusPoszitie) {
            System.out.println("Materie20082022.Gigel sta langa Marius");
        }else if (gigelPozitie - 1 == mariusPoszitie) {
            System.out.println("Materie20082022.Gigel sta langa Marius");
        } else {
            System.out.println("Materie20082022.Gigel nu sta langa Marius");
        }
    //    System.out.println(mariusPoszitie);
    //    System.out.println(gigelPozitie);
    }
}