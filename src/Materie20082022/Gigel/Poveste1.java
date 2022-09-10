package Materie20082022.Gigel;

public class Poveste1 {
    public static void main(String[] args) {
        String nume[] = {"Bogdan","Andrei", "Materie20082022/Gigel"};
        int gigelcount = 0;
        int len = nume.length;
        for (int i = 0; i <= len-1; i=i+1) {
            if (nume[i].contains("Materie20082022/Gigel")) {
                gigelcount = gigelcount+1;
            }else {
                gigelcount = gigelcount+0;
            }
        }
        if (gigelcount == 1) {
            System.out.println("Da, Materie20082022.Gigel sta la coada");
        }else {
            System.out.println("Nu, Materie20082022.Gigel nu sta la coada");
        }
    }
}
