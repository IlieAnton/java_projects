package Materie20082022.Liste;

public class Liste19 {
    public static void main(String[] args) {
        int a[] = {12,34,65,89};
        int suma = 0;
        int b = a.length;
        for (int i = 0; i <= b-1; i=i+1) {
            if (a[i] %10 == 5) {
             suma = suma + a[i];
            }
        }
        System.out.println(suma);
    }
}
