package Materie20082022.RandomString;

public class RandomS4 {
    public static void main(String[] args) {
        String[] cuvinte = {"Cuvant", "Bucatar", "Ospatar", "Politist"};
        int suma = 0;
        int len = cuvinte.length;
        for (int i = 0; i <= len - 1; i = i + 1) {
            suma = suma + cuvinte[i].length();
        }
        System.out.println(suma);
    }
}
