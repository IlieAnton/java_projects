package Materie20082022.AlteMiciPrograme;

public class Tema11si12a {
    public static void main(String[] args) {
        int c1 = 3;
        int c2 = 4;
        int ct1 = 2;
        int ct2 = 3;
        int zile = 31;
        int transportToateC1 = c1 * ct1;
        int transportToateC2 = c2 * ct2;
        int toateCamionele = transportToateC1+transportToateC2;
        int toatecamioneleinnzile = toateCamionele * zile;
        System.out.println("Pot transporta " + toatecamioneleinnzile + " kg");
    }
}
