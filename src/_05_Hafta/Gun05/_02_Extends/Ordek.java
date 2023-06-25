package _05_Hafta.Gun05._02_Extends;

public class Ordek extends Hayvan {
    private int kanatAcikligi;
    public Ordek(String renk, int kilo, String cinsi,int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        System.out.println("vak vak");
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }


}
