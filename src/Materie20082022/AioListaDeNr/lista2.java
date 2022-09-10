package Materie20082022.AioListaDeNr;

public class lista2 {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 6};
        int len = lista.length - 1;
        Boolean ok = true;
        for (int i = 0; i <= len; i = i + 1) {
            if (lista[len] % lista[i] != 0) {
                ok = false;
            }
        }
        if (ok == true) {
            System.out.println("Toate nr. din lista sunt multiplii ultimului nr.");
        } else {
            System.out.println("Toate nr. din lista nu sunt multiplii ultimului nr.");
        }
    }
}
