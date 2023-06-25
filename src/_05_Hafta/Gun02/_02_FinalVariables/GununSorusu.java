package _05_Hafta.Gun02._02_FinalVariables;

public class GununSorusu {
    int a;
    static int b=0;// sen bitanesin 2 tane zaten olmaz
    void arttir()
    {
        a++;
        b++;
    }

    
    
    public static void main(String[] args) {
        GununSorusu gs1 = new GununSorusu();
        gs1.a =5;
        
        GununSorusu gs2=new GununSorusu();
        gs2.a=7;
        // a'nin degeri kac oldu su anda: Burada verilecek cevap hangi a'yi soruyorsunuz olmali.
        //Burada her nesnenin a'si var ve gs1'in 5, gs2'nin ise 7 degeri var
        System.out.println("gs1.a = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);

        // soru b'nin degeri kactir : tek bir degeri vardir en son deger
        System.out.println("GununSorusu.b = " + GununSorusu.b);
        
        gs1.arttir();// gs1.a ->6, b=1
        gs2.arttir();// gs2.a -> 8, b=2
        // soru a'nin ve b'nin en son degerlerini arttirir
        System.out.println("s1.a = " + gs1.a);
        System.out.println("s2.a = " + gs2.a);
        System.out.println("Soru.b = " + GununSorusu.b);
    }
}
