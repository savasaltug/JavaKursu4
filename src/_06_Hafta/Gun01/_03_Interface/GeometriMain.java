package _06_Hafta.Gun01._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {
        Cember c = new Cember();
        c.ciz(); // cember cizildi

        Diktortgen d =new Diktortgen();
        d.ciz(); // diktortgen cizildi

        // interfacelerden nesne uretilemez fakat referans tipi
        // olusturulabilir. Bu bize polymorphisim sagladi.
        ICizdirir c2= new Cember();
        c2.ciz(); // cember cizildi

        // direkt olarak interfacedeki
        // ismi verilmis olanlar metodlara erisebilirsin

        cizdirme(c);
        cizdirme(d);

    }
    public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }
}
