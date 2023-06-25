package _03_Hafta.Gun07;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // bir ogretmenden girmek istedigi kadar notu aliniz,
        // ogretmene devam etmek istiyor musunuz (E/H) seklinde sorunuz
        // ve ortalamayi gecen ogrenci sayisini bulunuz.

        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        ArrayList<Integer> notlar= new ArrayList<>();
        int toplam = 0;
        String devamMi;

        do{
            // notu girecek
            System.out.print("not = ");
            int not = inInt.nextInt();
            // notlari arrayliste at
            notlar.add(not);
            // girilen notlari topla
            toplam = toplam + not;
            // devam etmek istiyor musunuz (E/H)
            System.out.println("devam etmek istiyor musunuz (E/H)");
            devamMi = inStr.next();

        }while (devamMi.equalsIgnoreCase("E"));

        // ortalamayi bul
        int ort = toplam / notlar.size();
        // gecen sayisini bul

        System.out.println("ort = " + ort);
        int gecenSayisi=0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ort)
                gecenSayisi++;

        }
        System.out.println("gecenSayisi = " + gecenSayisi);
    }
}
