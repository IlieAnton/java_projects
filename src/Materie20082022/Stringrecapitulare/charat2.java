package Materie20082022.Stringrecapitulare;

public class charat2 {
    public static void main(String[] args) {
        String a = "Ana are Rosii";
        int a1 = a.length();
        int a2 = a1 - 1;
        if (a.charAt(a2) == '.') {
            System.out.println("Da, se termina cu punct");
        }else {
            System.out.println("Nu, nu se termina cu punct");
        }
    }
}