package Materie20082022.Stringrecapitulare;

public class lastIndexOf {
    public static void main(String[] args) {
        String a = "Vreau sa am numai note bune la scoala b";
        int a1 = a.indexOf("b");
        int a2 = a.lastIndexOf("b");
        if (a1 != a2) {
            System.out.println("Nu, apare doar o data");
        }else {
            System.out.println("Apare doar o data");
        }
    }
}
