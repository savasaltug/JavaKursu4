package _04_Hafta.Gun06._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {
        int sayi = 345;
        String strSayi = String.valueOf(sayi);
        int intSayi = Integer.parseInt(strSayi);

        Utilitiy ut = new Utilitiy();
        String strSayi2 = ut.getString(sayi);

        // Static metodlar zaten var olduklari icin
        // new ile yeni olusturulmaya ihtiyac duymazlar.
        String strSayi3=Utilitiy.getString2(sayi);

    }
}
