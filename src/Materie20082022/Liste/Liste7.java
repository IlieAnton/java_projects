package Materie20082022.Liste;

public class Liste7 {
    public static void main(String[] args) {
        int[] a = {1, 22, 3, 4};
        int b = a.length;
        for (int i = 0; i <= b - 1; i = i + 1) {
            if (a[i] % 2 > 0) {
                System.out.println(a[i] * 2);
            }
        }
    }
}
