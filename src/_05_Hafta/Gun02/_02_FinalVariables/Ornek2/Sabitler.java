package _05_Hafta.Gun02._02_FinalVariables.Ornek2;

public class Sabitler {
    final static int birGundekiSaatSayisi = 24;
    final static int birSaattekiDakikaSayisi =60;
    final static int birDakikadakiSaniyeSayisi = 60;

    public static int hesapla(int gun, int saat, int dakika){
        int toplamSaniye=
                gun*Sabitler.birGundekiSaatSayisi
                        *Sabitler.birSaattekiDakikaSayisi
                        *Sabitler.birDakikadakiSaniyeSayisi
                        +
                        saat
                                *Sabitler.birSaattekiDakikaSayisi
                                *Sabitler.birDakikadakiSaniyeSayisi
                        +
                        dakika
                                *Sabitler.birDakikadakiSaniyeSayisi;
        return toplamSaniye;
    }

}
