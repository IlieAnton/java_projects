package Materie20082022.Clasaobiect;

import java.util.Scanner;

public class Jucarii3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        JucarieNoua a = new JucarieNoua();
        a.durabilitate = true;
        a.pret = 100;

        JucarieNoua b = new JucarieNoua();
        b.durabilitate = true;
        b.pret = 70;

        JucarieNoua c = new JucarieNoua();
        c.durabilitate = false;
        c.pret = 50;

        JucarieNoua[] grup = {a, b, c};

        for (int i = 0; i < grup.length; i++) {
            if (grup[i].pret > s1) {
                System.out.println(grup[i].pret);
            }
        }
    }
}
