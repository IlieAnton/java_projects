package Materie20082022.GigelSeIntoarce;

public class GigelSeIntoarce {
    public static void main(String[] args) {
        String Nume[] = {"Miriam" ,"Adi", "Marius", "Materie20082022/Gigel", "Andrei", "George"};
       int nr = Nume.length-1;
       int miriamPozitie = 0;
        for (int i = 0; i <= nr; i=i+1) {
           if (Nume[i].contains("Miriam")) {
               miriamPozitie = i;
            }
        }
        if (miriamPozitie == nr) {
            System.out.println("Miram este ultimul");
        }else {
            System.out.println("Miriam nu este ultimul");
        }
    }
 }
