package Materie20082022.Recapitulare;

public class TaraMain {
    public static void main(String[] args) {
        int nrtari = 0;
        int nrtaricupop = 0;
        int exista = 0;
        Tara a = new Tara("Romania", "Rosu, Galben si Albastru", 19000000, "Iohannis", 1990);

        Tara b = new Tara("Ucraina", "Albastru, Galben", 300000000, "Zelenski", 1991);

        Tara c = new Tara("Republica Central Africana", "galben, verde si Rosu", 250000000, "Alex", 1954);
        Tara[] tari = {a, b, c};
        for (int i = 0; i <= tari.length - 1; i = i + 1) {
            nrtari = nrtari + 1;
            //   if (tari[i].nume.contains("l")) {
            //       System.out.println(tari[i].nume);
            // ex 2
            //    if (tari[i].nume.contains(" ")) {
            //       System.out.println(tari[i].nume);
            // ex 3
            //    if (tari[i].tricolor.contains("Galben") && tari[i].presedinte.contains("i")) {
            //          System.out.println(tari[i].nume);
            //          System.out.println(tari[i].presedinte);
            //   }
            // ex 4
            //     if (tari[i].populatie > 200000000) {
            //        nrtaricupop = nrtaricupop +1;
            //    }
            //    }
            //        }
            //    }
            // ex 5
            if (tari[i].tricolor.contains("Rosu")) {
                exista = exista + 1;
            }
            // ex 6
            if (tari[i].anFondata > 1960 && tari[i].populatie <= 200000000) {
                System.out.println(tari[i].nume);
            //    System.out.println(tari[i].populatie);
             //   System.out.println(tari[i].anFondata);
            }
            //  System.out.println(tari.length);
            //  System.out.println(nrtari);
            //   System.out.println(nrtaricupop);

        }
        System.out.println("--------------------------------");
        if (exista > 0) {
            System.out.println("exista");
        } else {
            System.out.println("Nu exista");
        }
    }
}
