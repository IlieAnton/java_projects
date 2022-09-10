package Materie20082022.Liste;

public class Liste18 {
    public static void main(String[] args) {
        int a[] = {10,23,43,90};
        int suma = 0;
        int b = a.length;
        for (int i = 0; i <= b-1; i = i + 1) {
            if (a[i] %2 == 0) {
                suma = suma+ a[i];
            }
        }
        System.out.println(suma);
    }
}
