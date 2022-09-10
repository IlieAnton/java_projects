package Scoala;

public class ScoalaMain {
    public static void main(String[] args) {
        Elev a = new Elev("Nedea", "Ilie", 12, "6B");
        Nota nota = new Nota(9, "Mate");
        a.note.add(nota);
        Nota nota2 = new Nota(10, "Istorie");
        a.note.add(nota2);
        System.out.println(a.note.size());
        for (int i = 0; i <= a.note.size() - 1; i = i + 1) {
            if (a.note.get(i).materia == "Istorie") {
                System.out.println(a.note.get(i).valoare);
            }
        }
    }
}
