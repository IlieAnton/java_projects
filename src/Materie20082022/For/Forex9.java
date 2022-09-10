package Materie20082022.For;

public class Forex9 {
    public static void main(String[] args) {
        String a = "ana are mere";
        int lungime = a.length();
        int vocale = 0;
        int consoane = 0;

        for (int a2 = 0; a2 <= lungime - 1; a2 = a2 + 1) {
            int g = a.charAt(a2);
            if (g == 'a' || g == 'e' || g == 'i' || g == 'o' || g == 'u') {

                vocale++;
            } else if (a.charAt(a2) != ' ') {
                consoane++;
            }
        }
        System.out.println("Au fost " + vocale + " vocale");
        System.out.println("Au fost " + consoane + " consoane");
    }
}
