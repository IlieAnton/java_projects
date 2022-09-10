package OOP.ClaseObiecte;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop1 a = new Laptop1(12000, "bun", true, true, "Apple", "Intel", 1, "KnightsOS");
        a.turnOn();
        a.turnOff();
        a.sell();
        a.factoryReset();


    }
}