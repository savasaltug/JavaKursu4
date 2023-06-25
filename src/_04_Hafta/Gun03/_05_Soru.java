package _04_Hafta.Gun03;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        // canli sozluk yapilmak isteniyor.
        // kullaniciya asagidaki gibi bir menu cikariniz.
        // 1- Ekleme { Bu secenekte kelimenin kendisi ve manasini bir cumle ile yaziniz)
        // 2- Duzeltme ( bu secenekte kullaniciya kelimenin manasini duzelttiriniz)
        // 3- Listeleme
        // 4- Arama ( bu secenekte verilen bir kelimeyle baslayan tum kelimelerin manalari)
        // 5- Silme
        // 6- Cikis

        Map<String, String> sozluk = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        int secim = 0;

//        do{
//            //menu cikacak
//            System.out.print("MENU\n1- EKLEME\n2- DUZELTME\n3- LISTELEME\n4- ARAMA\n5- SILME\n6- CIKIS\n Seciminiz = ");
//            //secim alinacak
//            secim = in.nextInt();
//
//            //secime gore islem yapilacak
//            switch (secim) {
//                case 1: // 1'i secti ise ekleme islemini yap
//                    // kelimeyi giriniz
//                    System.out.print("kelime giriniz= ");
//                    String kelime = in.nextLine();
//                    System.out.print("manasini yaziniz= ");
//                    String manasi = in.nextLine();
//                    // buna uygun degiskene ekle
//                    sozluk.put(kelime, manasi);
//                    break;
//                case 2: // 2'yi secti ise dezeltme islemini yap
//                    System.out.println("duzeltme islemi secildi");
//
//                    break;
//                case
//            }
//
//        }while

    }
}
