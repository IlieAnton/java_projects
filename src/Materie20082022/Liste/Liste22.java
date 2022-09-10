package Materie20082022.Liste;

public class Liste22 {
    public static void main(String[] args) {
        int a[] = {30,34,15,89};
        int suma = 0;
        int b = a.length;
        for (int i = 0; i <= b-1; i=i+1) {
            if (a[i] < 60 && a[i] > 20) {
                suma = suma + a[i];
            }
        }
        System.out.println(suma);

    }
}
