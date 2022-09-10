package Materie20082022.Liste;

public class Liste13 {
    public static void main(String[] args) {
        int a [] = {12,31,34,109,78};
        int b = a.length;
        for (int i = 0; i <= b-1; i=i+1){
            if (a[i] %10 %2 == 1) {
                System.out.println(a[i]);
            }
        }
    }
}
