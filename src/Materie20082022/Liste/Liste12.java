package Materie20082022.Liste;

public class Liste12 {
    public static void main(String[] args) {
        int a [] = {6,5,7,100,56,999};
        int nr2 = 99;
        int nr3 = 1000;
        int b = a.length;
        for (int i = 0; i <= b-1; i = i+1) {
            if (a[i] < nr3 && a[i] > nr2) {
                System.out.println(a[i]);
            }
        }
    }
}
