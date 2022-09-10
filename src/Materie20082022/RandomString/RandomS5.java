package Materie20082022.RandomString;

public class RandomS5 {
    public static void main(String[] args) {
        String cuvinte[] = {"Copac","Masina","Pasari","Bloc"};
        int len = cuvinte.length;
        int impare = 0;
        int pare = 0;
        for (int i = 0; i <= len-1; i=i+1) {
            if (cuvinte[i].length() %2 == 0) {
                pare = pare+1;
            }else {
                impare = impare + 1;
            }
        }
        System.out.println("Sunt " + impare + " cuvinte impare");
        System.out.println("Sunt " + pare + " cuvinte pare");
    }
}
