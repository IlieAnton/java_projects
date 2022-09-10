package Materie20082022.Liste;

public class Liste14 {
    public static void main(String[] args) {
        int a[] = {111, 12, 22, 32, 452};
        int b = a.length;
        for (int i = 0; i <= b - 1; i = i + 1) {
            System.out.println(a[i] / 10 %10 + a[i] %10);
            }
        }
    }