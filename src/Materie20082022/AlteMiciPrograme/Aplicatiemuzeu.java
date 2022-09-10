package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Aplicatiemuzeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bun venit pe siteul oficial al Muzeului de Istorie din Romania!");
        System.out.println("Despre ce ati dorii sa aflati mai multe?");
        System.out.println("1.Cumparat biliete");
        System.out.println("2.Informatii generale");
        System.out.println("3.Urmatoarele evenimente");
        System.out.println("4.program");
        int nr = scanner.nextInt();
        if (nr == 1) {
            System.out.println("1 bilet de adult costa 20 de lei");
            System.out.println("1 bilet de copil 5 lei");
            System.out.println("Cate bilete de adult doriti sa cumparati?");
            int nr1 = scanner.nextInt();
            int a = nr1 * 20;
            System.out.println("Cate bilete de copil doriti sa cumparati?");
            int nr2 = scanner.nextInt();
            int b = nr2 * 5;
            int c = a+b;
            System.out.println("Biletele cumparate costa: " + c);
        }
        if (nr == 2) {
            System.out.println("Muzeul de istorie din Romania detine multe exponate  interesante de istorice incluzand:Schelete de animale primitive, unelte folosite din toate epocile si mai multe!");
        }
        if (nr == 3) {
            System.out.println("Programul care-i saptamani doriti sa-l vizionati?");
            int sapt = scanner.nextInt();
            if (sapt == 1) {
                System.out.println("In urmatoarea saptamana se va tine o expozitie de obiecte ale culturilor apartinand triburilor din Africa");
            }
            else if (sapt == 2) {
                System.out.println("In a doua saptamana se va tine o expozitie de schelete de reptile preistorice");
            }
            else if (sapt == 3) {
                System.out.println("In a treia saptamana se va tine o expozitite de unelte din cupru");
            }else {
                System.out.println("Inca nu cunoastem programul acelei saptamiani.");
            }
        }
        if (nr == 4) {
            System.out.println("Program:");
            System.out.println("Luni: 9-18");
            System.out.println("Marti: 9-18");
            System.out.println("Miercuti: 10-19");
            System.out.println("Joi: inchis");
            System.out.println("Vineri: inchis");
            System.out.println("Sambata: 9-19");
            System.out.println("Duminica:9-19");
        }
    }
}
