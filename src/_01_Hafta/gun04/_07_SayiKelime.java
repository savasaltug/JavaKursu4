package _01_Hafta.gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        //stringi sayiya cevirmek

        String ad = "ismet";
        String kelimeSayi= "65";

        int intdeger= Integer.parseInt(kelimeSayi);// sayi gorunumlu simgeyi, sayiya(int) donusturdu.
        System.out.println("intdeger = " + intdeger);
        int toplam = intdeger+5;

        byte byteDeger= Byte.parseByte(kelimeSayi); // sayi gorunumlu simgeyi, sayiya(Byte) donsturdu
        System.out.println("byteDeger = " + byteDeger);

        //sayilari Stringe cevirmek

        int sicaklik = 18;
        // Bu gun hava sicakligi 18 derece
        System.out.println("Bugun hava sicakligi " +sicaklik+" derece");

        String sicaklikKelimeHali = Integer.toString(sicaklik); // toplanamaz
        // int toplam2 = sicaklikKelimeHali +5; yapilamaz cunku artik string

        System.out.println("bugun hava sicakligi " +sicaklikKelimeHali+" derece");
    }
}
