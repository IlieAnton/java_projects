package Materie20082022.aplicatiemilitara;

public class Exercitii3 {
    public static void main(String[] args) {
        String a = "acest string nu are vaoare";
        for (int b = 0; b <= a.lastIndexOf("a"); b = b + 1) {
            if (a.charAt(b) == 'a') {
                System.out.println(a.charAt(b));
            }
        }
    }
}
