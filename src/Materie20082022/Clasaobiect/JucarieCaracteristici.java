package Materie20082022.Clasaobiect;

public class JucarieCaracteristici {
    public static void main(String[] args) {
        Jucarie a = new Jucarie();
        a.eDurabil = true;
        a.functii = "Poate vorbii";
        a.infatisare = "Este un ursulet";
        a.nume = "Talking bear";
        a.pret = 100;
        Jucarie b = new Jucarie();
        b.eDurabil = true;
        b.functii = "Poate merge";
        b.infatisare = "Este o masinuta";
        b.nume = "Supermobil";
        b.pret = 250;
        Jucarie jucarii[] = {a, b};
        int suma = 0;

        for (int i = 0; i < jucarii.length; i++) {
            if (jucarii[i].pret <= 100) {
                System.out.println(jucarii[i].nume + " " + jucarii[i].infatisare + " care " + jucarii[i].functii + " e durabil: " + jucarii[i].eDurabil + " si costa " + jucarii[i].pret + " lei ");
            }
            suma = suma+jucarii[i].pret;
        }
        System.out.println(suma);
    //    System.out.println(jucarii[0].nume + " " + jucarii[0].infatisare + " care " + jucarii[0].functii + " e durabil: " + jucarii[0].eDurabil + " si costa " + jucarii[0].pret + " lei ");
     //   System.out.println(jucarii[1].nume + " " + jucarii[1].infatisare + " care " + jucarii[1].functii + " e durabil:" + jucarii[1].eDurabil + " si costa " + jucarii[1].pret + " lei ");
    }
    }
