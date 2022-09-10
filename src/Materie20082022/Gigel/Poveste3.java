package Materie20082022.Gigel;

public class Poveste3 {
    public static void main(String[] args) {
        String gigelStaIarLaCoada[] = {"Andrei", "Nicu", "Dumitru", "Materie20082022/Gigel"};
        int len = gigelStaIarLaCoada.length;
        for (int i = 0; i <= len - 1; i = i + 1) {
            if (gigelStaIarLaCoada[i].contains("Materie20082022/Gigel")) {
                if (i == 0)
                {
                    System.out.println(gigelStaIarLaCoada[i+1]);
                }else if (i == len-1){
                    System.out.println(gigelStaIarLaCoada[i-1]);
                }else {

                    System.out.println("Persoana din spatele lui Materie20082022.Gigel este " + gigelStaIarLaCoada[i - 1]);
                    System.out.println("Persoana din fata lui Materie20082022.Gigel este " + gigelStaIarLaCoada[i + 1]);
                }
            }
        }
    }
}

