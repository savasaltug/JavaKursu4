package _05_Hafta.Gun02._02_FinalVariables.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; // degistirilemez
    // yani sadece 1 kez veri atama sansi vae.
    static  int tcNoSayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
