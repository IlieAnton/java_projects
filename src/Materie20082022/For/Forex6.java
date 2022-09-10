package Materie20082022.For;

public class Forex6 {
    public static void main(String[] args) {
        String a = "Andrei are masini";
        int a1 = a.length();
        int E = 0;
        for (int b = 0; b <= a1-1; b = b+1) {
            if (a.charAt(b) == 'e')  {
                E = E + 1;

            }
        }
        System.out.println("E apare de " + E + " ori");
    }
}
