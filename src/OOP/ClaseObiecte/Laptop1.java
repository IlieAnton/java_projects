package OOP.ClaseObiecte;

public class Laptop1 {
        int pret;
        String hdd;
        Boolean isOn;
        Boolean isexpensive;
        String brand;
        String procesor;
        int numarnuclee;
        String os;

        public Laptop1 (int pret, String hdd, Boolean isexpensive, Boolean isOn, String brand, String procesor, int numarnuclee, String os) {
            this.pret = pret;
            this.hdd = hdd;
            this.isexpensive = isexpensive;
            this.isOn = isOn;
            this.brand = brand;
            this.procesor = procesor;
            this.numarnuclee = numarnuclee;
            this.os = os;
        }
        void turnOn() {
            System.out.println("Se deschide laptopul de brand" + brand);
        }
        void turnOff() {
             System.out.println("Se inchide laptopul de brand" + brand);
    }
    void sell() {
        System.out.println("Laptopul costa " + pret + " de lei");
    }
    void factoryReset() {
        System.out.println("");
    }
    }

