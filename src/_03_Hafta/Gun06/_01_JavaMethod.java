package _03_Hafta.Gun06;

public class _01_JavaMethod {
    public static void main(String[] args) {
//        merhabaYaz(); // giden yok donen yok
//        toplamYaz(4,5); // giden var, donen yok (fonksiyonu bir seye esitleyebiliyor musun)
        int enb = Math.max(4,5); // giden var, var (fonksiyonu bir seye esitleyebilir misin)
        double sayi = Math.random(); // gideni yok donen var

//        enbYaz(4,5);
        enb=enbBul(15,5);
        System.out.println("enb = "+ enb);
    }
    public static int enbBul(int a, int b)// donecek tip
    {
        int donecek =0;
        if (a>b)
            donecek = a;
        else
            donecek= b;
        return donecek; // donecek deger
    }

}
