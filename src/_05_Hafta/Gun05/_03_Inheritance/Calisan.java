package _05_Hafta.Gun05._03_Inheritance;

public class Calisan {
    private String isim;
    private int maas;
    private int maasKatsayisi;

    public Calisan(String isim, int maas, int maasKatsayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }
    public int maasHesapla(){
        return maas*maasKatsayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(int maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                ", Odenecek maas="+ maasHesapla()+'}' ;
    }
}
