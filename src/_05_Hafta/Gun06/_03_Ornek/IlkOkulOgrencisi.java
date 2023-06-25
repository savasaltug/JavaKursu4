package _05_Hafta.Gun06._03_Ornek;

public class IlkOkulOgrencisi extends Ogrenci {
    private String kulup;
    private static int ilkOkulSayac=1;
    public IlkOkulOgrencisi(String isim, OgrTip tipi, String kulup) {
        super( isim, tipi, ilkOkulSayac);
        setKulup(kulup);
    }

    public String getKulup() {
        return kulup;
    }

    public void setKulup(String kulup) {
        this.kulup = kulup;
    }

    @Override
    public String toString() {
        return "IlkOkulOgrencisi{" +
                "kulup='" + kulup + '\'' +
                "} " + super.toString();
    }


}
