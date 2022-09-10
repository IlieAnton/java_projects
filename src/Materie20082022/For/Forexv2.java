package Materie20082022.For;

public class Forexv2 {
    public static void main(String[] args) {

        String a = "Ana Are mere";
        a = a.toLowerCase();
        char x = 'a';
        int length = a.length();
        String a2 = "";
        for (int i = 0; i <= length - 1; i = i + 1) {
            if (a.charAt(i) == x) {
                a2 = a2 + ',';
            } else {
                a2 = a2 + a.charAt(i);
            }
        }
        System.out.println(a2);
    }
}
