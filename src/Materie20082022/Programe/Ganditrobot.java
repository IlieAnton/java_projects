package Materie20082022.Programe;

import java.util.Random;

public class Ganditrobot {
    public static void main(String[] args) {
        int a = 7;
        String subiecte[] = {"Habarnam", "Gogoasa", "Stietot", "Limonada"};
        String predicate[] = {"merge", "sare", "vorbeste", "mananca"};
        String Cuvinte[] = {"repede", "fericit", "plictisit"};
        int clen = Cuvinte.length;
        int slen = subiecte.length;
        int blen = predicate.length;
        Random r = new Random();
        int randomizare = r.nextInt(a);
        int nr = r.nextInt(slen);
        int nr2 = r.nextInt(blen);
        int nr3 = r.nextInt(clen);
        if (randomizare > 3) {
            System.out.println(subiecte[nr] + " " + predicate[nr2] + " " + Cuvinte[nr3]);
        } else {
            System.out.println(subiecte[nr] + " " + predicate[nr2]);
        }
    }
}
