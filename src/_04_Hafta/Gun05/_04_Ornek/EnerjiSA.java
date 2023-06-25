package _04_Hafta.Gun05._04_Ornek;

public class EnerjiSA {
    public static void main(String[] args) {
       /* 1.Adim : Musteri isimli (fields: name) isimli bir class tanimlayiniz.
        2.Adim: ElektirikHesabi isimli ( fields: toplam tuketim(int),birim fiyat(double),
        fatura(double)) class tanizlayiniz.
        3.Adim : Musteri a bir ElektrikHesabi () -> ekleyiniz.
        4.Adim: 1 tane musteri olusturunuz.
        5.Adim: Musteriye ait her ay tuketilen enerjiyi toplayacak bir metod yaziniz.
        tuketimEkle olsun her verilen aylik rakami toplayarak biriktirsin.
        6.Adim: Odenecek rakami toplam tuketim oran (0.7) ile carparak hesaplatiniz.

        Ipucu: hesabi olusturduktan sonra tuketimEkle metoduna 2,3 ay tuketim ekletin
        ondan sonra toplam olarak cikartiniz.

        */

        Musteri mus1 = new Musteri();
        mus1.name= "savas Altug";
        mus1.elektirikHesabi=new ElektirikHesabi();
        mus1.elektirikHesabi.tuketimEkle(50);
        mus1.elektirikHesabi.tuketimEkle(60);
        mus1.elektirikHesabi.tuketimEkle(70);
        mus1.elektirikHesabi.toplamTuketimYaz();

        mus1.elektirikHesabi.faturaYaz(mus1.name);
    }
}
