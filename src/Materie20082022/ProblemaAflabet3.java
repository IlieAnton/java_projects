package Materie20082022;

public class ProblemaAflabet3 {
    public static void main(String[] args) {
        String alfa = "abcdefghijklmnoprstuvwxyz";
        String a = "abcdefghijklmnoprstuvwxyz";
        int i = 0;
        for (; i <= a.length()-1; i=i+1) {
            if (a.contains(""+alfa.charAt(i))==false) {
            break;
            }
        }
        System.out.println(i);
        if (i == 25) {
            System.out.println("Propozitia contine toate literele alfabetului");
        }else {
            System.out.println("Propozitia nu contine toate literele alfabetului");
        }
    }
}
