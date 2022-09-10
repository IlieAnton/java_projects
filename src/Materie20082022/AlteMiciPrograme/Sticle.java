package Materie20082022.AlteMiciPrograme;

import java.util.Scanner;

public class Sticle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //System.out.println(y/x);
        if (y%x == 0) {
            System.out.println(y/x);
        }else{
            System.out.println(y/x+1);
        }
    }
}
