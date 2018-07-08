public class ZadanieJava32 {

    public static void main(String[] args) {
        System.out.println("- Klasa to szablon, swojego rodzaju kontener przechowujący obiekty takie jak np. " +
                "pola i metody.");
        System.out.println("- Obiekt to egzemplarz klasy i jest tworzony na podstawie deklaracji.");
        System.out.println("- Zmienna to obiekt, który zawiera konretne wartości zależne od typu danych. " +
                "Wartość zmiennej może być modyfikowana.");
        System.out.println("- Każda zmienna musi mieć określony typ, np. int, albo String.");
        System.out.println("- W klasie mogą się znajdować obiekty, pola i metody.");
        System.out.println("- Konstruktory są wywoływane przez operator new i służą do tworzenia nowych obiektów.");
        System.out.println("- Jeśli w klasie zdefiniowano chociaż jeden … to kompilator nie wygeneruje dla nas konstruktora domyślnego.");
        System.out.println("- Zakładając, że istnieje klasa Car, to przy zapisie:");
        System.out.println("Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);\n" +
                "\n" +
                "car1 nazywamy konstruktorem,");
        System.out.println("a przy zapisie:\n" +
                "\n" +
                "Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);  Car car2 = car1;\n" +
                "\n" +
                "car1 I car2 to dwie zmienne wskazujące na ten sam konstruktor");
    }
}
