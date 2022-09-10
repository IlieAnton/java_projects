package Materie20082022.Liste;

public class Liste23 {
    public static void main(String[] args) {
        int a[] = {310,2030,1015,189};
        int suma = 0;
        int b = a.length;
        for (int i = 0; i <= b-1; i=i+1) {
            if (a[i] > 1000) {
                suma = suma + a[i];
            }
        }
        System.out.println(suma);
    }
}
