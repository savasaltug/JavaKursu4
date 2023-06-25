package _04_Hafta.Gun07._04_Constructor;

public class Bankalar {
    // Bir banka class'i tanimlayiniz.
    // 3 adet field ekleyiniz.(adi subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu olusturun.
    //3 tane nesne olusturup mainde yazdiriniz.
    public static void main(String[] args) {
        Banka bnk1 = new Banka("Ziraat",1861,1863);
        Banka bnk2 = new Banka("Garanti",500);
        Banka bnk3 = new Banka();

        System.out.println("bnk1 = " + bnk1);
        System.out.println("bnk2 = " + bnk2);
        System.out.println("bnk3 = " + bnk3);
    }
}
