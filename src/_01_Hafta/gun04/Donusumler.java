package _01_Hafta.gun04;

public class Donusumler {
    public static void main(String[] args) {
        byte ogrNot = 90;

        int notToplam = ogrNot; // byte turunu int turune atmis olduk widening, genisletme.

        ogrNot = (byte)notToplam; // int turunu byte turune donusturuyorum,
        // bunu ancak veri kaybi olusmuyorsa yani deger atilacak tipe sigiyorsa yapabilirim,
        // bunu da bilerek yaptigini belirtmek icin, donusecek tipin basina hedef tpipn adi
        // parantez icinde yazilir. Daraltma(Norrow) yonunde donusum (Casting) denir.
    }
}
