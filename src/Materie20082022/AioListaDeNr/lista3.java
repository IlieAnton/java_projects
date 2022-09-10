package Materie20082022.AioListaDeNr;

public class lista3 {
    public static void main(String[] args) {
        int[] list = {6,7,6,5,4,3,2,1};
        int len = list.length-1;
        int valoare = -1;
        Boolean ok = true;
        for (int i = 0; i<= len; i=i+1) {
            if (list[0] < list[i]) {
                valoare = i;
                ok = false;
            }
        }
        if (ok == true) {
            System.out.println("Primul nr. este cel mai mare");
        }else {
            System.out.println("Primul nr. nu este cel mai mare");
        }
    }
}
