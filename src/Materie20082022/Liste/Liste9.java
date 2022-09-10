package Materie20082022.Liste;

public class Liste9 {
    public static void main(String[] args) {
        int[] a = {7, 5, 27, 33, 113};
        int b = a.length;
        for (int i = 0; i <= b - 1; i = i + 1) {
            if (a[i] > 100) {
                System.out.println(a[i]);
            }
        }
    }
}
