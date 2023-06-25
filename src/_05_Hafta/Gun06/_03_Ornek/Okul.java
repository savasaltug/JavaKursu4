package _05_Hafta.Gun06._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1 = new LiseOgrencisi("savas altug", OgrTip.LISE, "say");
        LiseOgrencisi lo2 =new LiseOgrencisi("mehmet yilmaz", OgrTip.LISE, "soz");
        IlkOkulOgrencisi io = new IlkOkulOgrencisi(" ayse bayrak", OgrTip.ILK, "satranc");


        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io = " + io);

    }
}
