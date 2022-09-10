package Materie20082022.Liste;

public class Liste10 {
    public static void main(String[] args) {
        int[] a = {2, 4, 10, 33};
        int b = a.length;
        for (int i = 0; i <= b - 1; i = i + 1) {
            if (a[i] < 32) {
                System.out.println(a[i]);
            }
        }
    }
}
