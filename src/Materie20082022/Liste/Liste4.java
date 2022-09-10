package Materie20082022.Liste;

public class Liste4 {
    public static void main(String[] args) {
        int [] liste = {1,4,3,8};
        int lungime = liste.length;
        for (int a = 0; a <= lungime-1; a=a+1) {
            if (liste[a]% 2 == 0) {
                System.out.println(liste[a]);
            }
        }
    }
}
