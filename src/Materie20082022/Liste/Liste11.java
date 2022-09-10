package Materie20082022.Liste;

public class Liste11 {
    public static void main(String[] args) {
        int[] a = {8, 3, 4, 12, 13, 99};
        int nr = 100;
        int nr2 = 9;
        int b = a.length;
        for (int i = 0; i <= b - 1; i = i + 1) {
            if (a[i] > nr2 && a[i] < nr) {
                System.out.println(a[i]);
            }
        }
    }
}
