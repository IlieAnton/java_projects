package Materie20082022.Liste;

public class Liste15 {
    public static void main(String[] args) {
        int[] a = {17, 105, 1006};
        int b = a.length;
        for (int i = 0; i <= b - 1; i = i + 1) {
            if (a[i] % 10 > 5) {
                System.out.println("Da.");
            } else {
                System.out.println("Nu.");
            }
        }
    }
}
