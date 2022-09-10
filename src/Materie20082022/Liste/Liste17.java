package Materie20082022.Liste;

public class Liste17 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int suma = 0;
        int b = a.length;
        for (int i = 0; i <= b-1; i=i+1) {
            suma = suma + a[i];
        }
        System.out.println(suma);
    }
}
