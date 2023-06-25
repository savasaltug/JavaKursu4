package _04_Hafta.Gun04;

public class _01_JavaClassAndObject {
    // metodlarin yazildigi yer
    public static void main(String[] args) {
        // ana programin basladigi ve calistigi yer
        int sayi = 5;

        Araba benimArabam = new Araba(); // Araba tur, tip(class) adi, benimArabam = nesne
        benimArabam.marka="BMW";
        benimArabam.renk="beyaz";
        benimArabam.motorHacmi=1.4;
        benimArabam.yili=2022;


        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        
        
    }// dur


    // metodlarin yazildigi yer

}


// Class - tiplerin tanimlandigi yer

class Araba {
    String renk;
    int yili;
    String marka;
    double motorHacmi;
}
