package _05_Hafta.Gun05._02_Extends;

public class Kedi extends Hayvan {
    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("miyavladi");
    }
}
