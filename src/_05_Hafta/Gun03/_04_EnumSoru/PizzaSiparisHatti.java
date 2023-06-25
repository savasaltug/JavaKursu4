package _05_Hafta.Gun03._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
        //    Bir pizza siparig hatt1 yapilmak isteniyor.
        //
        //    Kullaniciya Pizza icin 1-Small,2-Medium,3-Large, 4-Goster
        //    seceneklerini bir menu seklinde vererek, verdigi pizzalari
        //    bir ARRAYLIST e atiniz.
        //
        //    Goster (4) U sectiginde her pizzadan kacgar tane siparis
        //    verdigini bir metodda yazdariniz.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Pizza> siparisler = new ArrayList<>();

        int secim = 0;
        do{
            // menu
            menu();
            secim = in.nextInt();
            // scannerla secimi alalim
            // secilen pizza Arraylist'e ekleyelim
            switch (secim){
                case 1: // small
                    Pizza sp = new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2:// medium
                    Pizza mp = new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3:// large
                    Pizza lp = new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4: siparisYazdir(siparisler);
                    // eger 4'u secerse arraylist'i bir metoda gonder
                    // orada hangi pizzadan kac siparis verdigini goster
                    break;
            }
            // eger 4'u secerse arraylist'i bir metoda gonder
            // orada hangi pizzadan kac siparis verdigini goster
        }while (secim<=4);


    }
    public static void menu()
    {
        System.out.println("****** Pizza Menu *******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - Isleme Al - Siparis Goster");
        System.out.println("5 - Cikis");
        System.out.print("Seciminiz =");
    }
    public static void siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0, m=0, l=0;
        for (Pizza p : siparisler){
            if (p.size == PizzaSize.SMALL) s++;
            else if (p.size == PizzaSize.MEDIUM) m++;
            else if (p.size == PizzaSize.LARGE) l++;
        }
        System.out.println("***** Siparisleriniz ******");
        System.out.println("Small Pizza Count = " + s);
        System.out.println("Medium Pizza Count = " + m);
        System.out.println("Large Pizza Count = " + l);


    }


}
