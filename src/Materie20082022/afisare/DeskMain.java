package Materie20082022.afisare;

public class DeskMain {
    public static void main(String[] args) throws InterruptedException {
        Desk d = new Desk("Lemn", 1000, 6, true, "eu");
        System.out.println(d.material);
        System.out.println(d.pret);
        System.out.println(d.greutateinkg);
        System.out.println(d.eDurabil);
        System.out.println("Persoana A: Cine e proprietarul?");
        Thread.sleep(3 * 1000);
        System.out.println("Persoana B: Eu.");
        Thread.sleep(3 * 1000);
        System.out.println("Persoana A: Care eu?");
        Thread.sleep(3 * 1000);
        System.out.println("Persoana B: Eu, Ivan.");
        Thread.sleep(3 * 1000);
        System.out.println("Proprietar: " + d.proprietar);

    }
}
