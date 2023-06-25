package _06_Hafta.Gun02._01_Soru;

public class TeslaCar extends Vehicle implements IElectric{
    public TeslaCar(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Batarya'nin 9 yil omru var";
    }

    @Override
    public String drive() {
        return "Auto pilot ozelligi var";
    }
}
