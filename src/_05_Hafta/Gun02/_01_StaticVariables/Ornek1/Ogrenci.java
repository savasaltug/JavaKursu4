package _05_Hafta.Gun02._01_StaticVariables.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;

    static  String okulAd="Yildirim Ilk Okulu";

    // sen bitanesin

//nepsi icin gecerli tek bir tone el
//Tekrartayan ve tum nesneter i¢in kuLtanatacak
//degiskenter icgin STATIC kuttanzyoruz.
//static=sen bir tanesin

   // static varsa hafzadan tasorruf saglar.

// hepsine atanar, tek olarak hafizada butunur
//tipin, sznafan, clossin degiskeni oldu


    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                "okulAd= "+ okulAd + '\'' +
                '}';
    }
}
