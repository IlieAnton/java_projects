package Materie20082022.Clasaobiect;

public class Jucarii2 {
    public static void main(String[] args) {
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
        int mic = grup[0].pret;
        for (int i = 0; i < grup.length; i++) {
            if (grup[i].pret < mic) {
                mic = grup[i].pret;
            }
        }
        System.out.println(mic);
    }
}
