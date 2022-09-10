package Materie20082022.Liste;

public class Liste16 {
    public static void main(String[] args) {
        int a[] = {210,123,955};
        int b = a.length;
        for (int i = 0; i <= b-1; i = i+1) {
            if (a[i] /10 %10 == a[i] %10)  {
                System.out.println("Da");
            }else {
                System.out.println("Nu");
            }
        }
    }
}
