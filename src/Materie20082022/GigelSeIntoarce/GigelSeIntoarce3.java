package Materie20082022.GigelSeIntoarce;

public class GigelSeIntoarce3 {
    public static void main(String[] args) {
        String Nume[] = { "Marius", "Materie20082022/Gigel","Adi" , "George","Miriam","Andrei" };
        int nr = Nume.length-1;
        int andreiPozitie = 0;
        int georgePozitie = 0;
        int adiPozitie = 0;
        for (int i = 0; i <= nr; i=i+1) {
           if (Nume[i].contains("Andrei")) {
               andreiPozitie = i;
           }
           if (Nume[i].contains("George")) {
               georgePozitie = i;
            }
           if (Nume[i].contains("Adi")) {
               adiPozitie = i;
           }
        }
        if (andreiPozitie + 1 == georgePozitie && andreiPozitie -1 == adiPozitie) {
            System.out.println("Andrei sta intre George si Adi");
        }else if (andreiPozitie + 1 == adiPozitie && andreiPozitie -1 == georgePozitie) {
            System.out.println("Andrei sta intre George si Adi");
        } else {
            System.out.println("Andrei nu sta intre George si Adi");
        }
    }
}
