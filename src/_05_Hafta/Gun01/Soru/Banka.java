package _05_Hafta.Gun01.Soru;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int))

// Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))

// Bir banka vygulamasi igin 1 misteri tanimlayiniz,

// migterini hesabina sirasiyla 100 tl, 206tl yatiriniz,sonra 50 TL gekiniz.
// Mésteirinin toplan yatani, toplam cekileni ve kalan bakiyesini yazdiriniz.
// bakiyeye direkt para atanamadigini kontrol ediniz.

    public static void main(String[] args) {

        Musteri mus1 = new Musteri();

        mus1.musteriNo=1;
        mus1.ad="savas";
        mus1.soyad= "Altug";

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println(mus1.musteriHesap);
    }
}
