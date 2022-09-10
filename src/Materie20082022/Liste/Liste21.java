package Materie20082022.Liste;

public class Liste21 {
    public static void main(String[] args) {
        int[] a = {12, 34, 15, 89};
        int suma = 0;
        int b = a.length;
        for (int i = 0; i <= b - 1; i = i + 1) {
            if (a[i] % 2 > 0 && a[i] > 55) {
                suma = suma + a[i];
            }
        }
        System.out.println(suma);

    }
}
