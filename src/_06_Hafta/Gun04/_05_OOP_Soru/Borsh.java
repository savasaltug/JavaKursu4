package _06_Hafta.Gun04._05_OOP_Soru;

public class Borsh implements IFood{
    @Override
    public void taste() {
        System.out.println("Sicak sebze corbasi");
    }

    @Override
    public double ucret() {
        return 40;
    }
    void boil()
    {
        System.out.println("Kisik ateste kaynatilir");
    }

    void eatTomarrow()
    {
        System.out.println("Bir gun sonra servis edilir");
    }
}
