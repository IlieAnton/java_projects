package Materie20082022.atribute;



public class Cutie2 {
    public static void main(String[] args) {
        Cutie c = new Cutie("carton", 5, "mobila", false, 1, 2, 2);
        System.out.println(c.material);
     //   System.out.println(c.pret);
      //  System.out.println(c.continut);
      //  System.out.println(c.durabilitate);
       // System.out.println(c.lungime);
      //  System.out.println(c.latime);
      //  System.out.println(c.inaltime);
        Cutie c2 = new Cutie("lemn", 5, "mobila", false, 1, 2);
        System.out.println(c2.material);
        System.out.println("---------------------------");
        Cutie c3 = new Cutie("fier", 10, "mobila",true, 1);
        System.out.println(c3.material);
        System.out.println(c3.pret);
        System.out.println(c3.lungime);
        System.out.println("---------------------------");
        Cutie c4 = new Cutie("carton",5,"Sticla", true);
        System.out.println(c4.durabilitate);
        System.out.println(c4.pret);
        System.out.println("---------------------------");
        Cutie c5 = new Cutie("Otel", 1000, "Sercet");
        System.out.println(c5.material);
        System.out.println(c5.continut);
        System.out.println("---------------------------");
        Cutie c6 = new Cutie("Piatra",20, "pietre");
        System.out.println(c6.continut);
        System.out.println(c6.pret);
        System.out.println("---------------------------");
        Cutie c7 = new Cutie("Laser", 10000);
        System.out.println(c7.pret);
        System.out.println(c7.material);
        System.out.println("---------------------------");
        Cutie c8 = new Cutie("Otel de pe Marte");
        System.out.println(c8.material);
            }
        }