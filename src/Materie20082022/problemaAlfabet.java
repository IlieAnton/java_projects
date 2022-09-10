package Materie20082022;

public class problemaAlfabet {
    public static void main(String[] args) {
        String alfa = "abcdefghijklmnoprstuvwxyz";
        String a = "abcdefghijklmnoprstuvwxyz";
        int nralfa = 0;
        for (int i = 0; i <= alfa.length()-1; i=i+1) {
            if (a.contains(""+alfa.charAt(i))) {
               nralfa = nralfa+1;
            }
        }
        System.out.println(nralfa);
        if (nralfa == 25) {
            System.out.println("Propozitia contine toate literele alfabetului");
        } else {
            System.out.println("Propozitia nu contine toate literele alfabetului");
        }
    }
}
