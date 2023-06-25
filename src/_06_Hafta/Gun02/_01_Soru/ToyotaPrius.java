package _06_Hafta.Gun02._01_Soru;

public class ToyotaPrius extends Vehicle implements IElectric,IGas{
    public ToyotaPrius(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "omur boyu kullanilabilir";
    }

    @Override
    public String changeOil() {
        return "Her 1000 km'de bir degistirilmesi gerekiyor ";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrik ile gider";
    }
}
