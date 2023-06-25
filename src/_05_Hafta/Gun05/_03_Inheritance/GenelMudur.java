package _05_Hafta.Gun05._03_Inheritance;

public class GenelMudur extends Calisan{

    private int tazminat;
    public GenelMudur(String isim, int maas, int maasKatsayisi, int tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);

    }

    @Override
    public int maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{}"+
                "isim='" + getIsim() + '\'' +
                ", maas=" + getMaas() +
                ", maasKatsayisi=" + getMaasKatsayisi() +
                ", tazminat="+ tazminat+
                "odenecek maas=" + maasHesapla()+'}';
    }
}
