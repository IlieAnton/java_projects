package Materie20082022.Liste;

public class Liste6 {
    public static void main(String[] args) {
        int [] a = {14,21,22,23,24,34,4};
        int b = a.length;
        for (int i = 0; i <= b-1; i=i+1) {
            if (a[i] % 10 == 4) {
                System.out.println(a[i]);
            }
            }
        }
    }