public class Main {

    public static void main(String[] args) {

        Telewizor tv1 = new Telewizor("Samsung","UE32",32,"czarny",18.2);
        Telewizor tv2 = new Telewizor("Panasonic","Viera",60,"srebrny", 24.2);

//        tv1.marka = "Samsung";
//        tv1.model = "UE32";
//        tv1.kolor = "czarny";
//        tv1.iloscCali = 32;
//        tv1.napiecie = 18.2;
//
//        tv2.marka = "Panasonic";
//        tv2.model = "Viera";
//        tv2.kolor = "srebrny";
//        tv2.iloscCali = 60;
//        tv2.napiecie = 24.2;

        System.out.println("Telewizor 1: " + tv1.marka + " " + tv1.model + " " + tv1.kolor + " ilość cali: " + tv1.iloscCali + " napięcie " + tv1.napiecie + "V");
        System.out.println("Telewizor 2: " + tv2.marka + " " + tv2.model + " " + tv2.kolor + " ilość cali: " + tv2.iloscCali + " napięcie " + tv2.napiecie + "V");

    }
}
