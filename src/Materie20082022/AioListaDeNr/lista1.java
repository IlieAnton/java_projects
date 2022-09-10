package Materie20082022.AioListaDeNr;


public class lista1 {
    public static void main(String[] args) {
        int[] list = {1, 5, 6, 6, 5, 1};
        int len = list.length - 1;
        Boolean ok = true;
        for (int i = 0; i <= list.length /2; i = i + 1) {
            if (list[i] != list[len]) {
                ok = false;
            }
            len = len - 1;
        }
        if (ok == true) {
            System.out.println("Este oglinda");
        } else {
            System.out.println("Nu este oglinda");
        }
    }
    }
