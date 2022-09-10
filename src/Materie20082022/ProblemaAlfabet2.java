package Materie20082022;

public class ProblemaAlfabet2 {
    public static void main(String[] args) {
        String alfa = "abcdefghijklmnoprstuvwxyz";
        String a = "abcdefghijklmnoprstuvwxyz";
        String b = "";
        for (int i = 0; i <= alfa.length() - 1; i = i + 1) {
            if (a.contains("" + alfa.charAt(i))) {
                b = b + alfa.charAt(i);
            }
        }
        System.out.println(b);
        if (b.equals(alfa)) {
            System.out.println("Propozitia contine toate literele alfabetului.");
        } else {
            System.out.println("Propozitia contine toate literele alfabetului.");
        }
    }
}
