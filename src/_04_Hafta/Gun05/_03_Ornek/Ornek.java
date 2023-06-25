package _04_Hafta.Gun05._03_Ornek;

public class Ornek {
    public static void main(String[] args) {
        //1-Adim: Rectangle isminde ayri bir dosyada olmak uzere sinif yazdiriniz.
        //(Properties, fields, ozellik, eleman, items) : width,length
        //2-Adim :Cevre bulmak uzere Cevre isminde bir metod yaziniz.
        // 3-Adim: dikdortgenin alanini bulan Alan isimli bir metod yaziniz.
        //4-Adim :1 tane nesne'ye deger vererek metodlarin sonuclarini yazdiriniz.

        Rectangle r = new Rectangle();
        r.length=5;
        r.width=4;

        r.getAlan();
        r.getCevre();
    }
}
