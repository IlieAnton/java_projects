package Materie20082022.Liste;

public class Liste8 {
    public static void main(String[] args) {
        int [] a = {21,22,23,24};
        int b = a.length;
        for (int i = 0; i <= b-1; i = i+1) {
            if (a[i] %2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
