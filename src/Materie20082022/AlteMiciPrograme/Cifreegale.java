package Materie20082022.AlteMiciPrograme;

public class Cifreegale {
    public static void main(String[] args) {
        int nr = 212;
        int nr1 = nr % 10;
        //    System.out.println(nr1);
        nr = nr / 10;
        //   System.out.println(nr);
        int nr2 = nr % 10;
        nr = nr / 10;
        //  System.out.println(nr);
        if (nr1 == nr2 && nr1 == nr) {
            System.out.println("Da, sunt egale");
        } else {
            System.out.println("Nu, nu sunt egale");
        }
    }
}
