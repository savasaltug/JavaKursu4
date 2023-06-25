package _01_Hafta.gun04;

public class _05_Ornek {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short degisken tanimlayiniz
        //deger atayiniz, sonra double degiskenini short degiskenine cevirere,
        //butun degerleri ekrana yazdiriniz.

        double oran = 3.2;
        short kisa = 2;

        System.out.println("once kisa = " + kisa);
        kisa = (short)oran; // deger sigabildigi icin tam sayi kismini alir, ama ondalikli kisim alinamaz.
        System.out.println("sonra kisa = " + kisa);

        oran = 3000000.2;
        kisa = (short)oran; // short en fazla 32767 degeri alabilir.
        System.out.println("sonra kisa2 = " + kisa);
        // hem tam sayi kismi sigmiyor, hem de ondalikli kisim atilamiyor, tamemen deger kayboluyor.
    }
}
