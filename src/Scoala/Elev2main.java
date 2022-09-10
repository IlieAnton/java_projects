package Scoala;

import java.util.Scanner;

public class Elev2main {
    public static void main(String[] args) {
        Elev gigel = new Elev("Gogy", "Gigel", 13, "6B");
        Scanner scanner = new Scanner(System.in);

        int note9 = 0;
        int notemare5 = 0;
        int notemici5 = 0;
        int suma = 0;
        int media = 0;

        Nota n1 = new Nota(10, "Sport");
        gigel.note.add(n1);
        Nota n2 = new Nota(10, "Engleza");
        gigel.note.add(n2);
        Nota n3 = new Nota(9, "Romana");
        gigel.note.add(n3);
        Nota n4 = new Nota(10, "Franceza");
        gigel.note.add(n4);
        Nota n5 = new Nota(10, "Matematica");
        gigel.note.add(n5);
        Nota n6 = new Nota(7, "Istorie");
        gigel.note.add(n6);
        Nota n7 = new Nota(9, "Fizica");
        gigel.note.add(n7);
        Nota n8 = new Nota(10, "Biologie");
        gigel.note.add(n8);
        Nota n9 = new Nota(10, "Ed. Tehnologica");
        gigel.note.add(n9);
        Nota n10 = new Nota(10, "Ed.Tehnologica");
        gigel.note.add(n10);
        int ceaMaiMicaNota = gigel.note.get(0).valoare;
        int ceaMaiMareNota = gigel.note.get(0).valoare;
        for (int i = 0; i <= gigel.note.size() - 1; i = i + 1) {
            Nota nota = gigel.note.get(i);
            if (nota.materia == "Matematica") {
                System.out.println(nota.valoare);
            }
            if (nota.valoare == 9) {
                note9 = note9 + 1;
            }
            if (nota.valoare > 5) {
                notemare5 = notemare5 + 1;
            }
            if (nota.valoare == 10) {
                System.out.println(nota.materia);
                System.out.println("Aici se termina ex. 4");
            }
            if (nota.valoare == 9) {
                System.out.println(nota.materia);
            }
            if (ceaMaiMareNota < nota.valoare) {
                ceaMaiMareNota = nota.valoare;
            }
            System.out.println(note9);
            System.out.println("Note mai mari decat cinci: " + notemare5);
            notemici5 = gigel.note.size() - notemare5;
            System.out.println("Note mai mici decat cinci: " + notemici5);
            System.out.println(suma);
            media = media + suma / gigel.note.size();
            System.out.println(media);
            System.out.println("Cea mai mare nota este: " + ceaMaiMareNota);
        }
    }
}
