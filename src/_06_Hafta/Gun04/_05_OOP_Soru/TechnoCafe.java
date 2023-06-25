package _06_Hafta.Gun04._05_OOP_Soru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        List<IFood> siparisler = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int secim = 0;
        do{
            menu();
            secim = in.nextInt();
            switch (secim)
            {
                case 1: IFood ak = new AdanaKebap();
                siparisler.add(ak);
                break;

                case 2: IFood lhm = new Lahmacun();
                    siparisler.add(lhm);
                    break;

                case 3: IFood brosh = new Borsh();
                    siparisler.add(brosh);
                    break;


                case 4: IFood palov = new Palov();
                    siparisler.add(palov);
                    break;
            }




        }while (secim<5);

        System.out.println("Alinan siparisler");
        for (IFood f : siparisler){
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("Siparisleriniz hazirlaniyor.. \n");
        double toplam=0;
        for (IFood f: siparisler){
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();

        }
        System.out.println("Toplam ucret= "+ toplam);


    }
    public static void menu(){
        System.out.print("\n*******Menu" +
                "\n1-Adana Kebap (75 TL)" +
                "\n2- Lahmacun (40 TL)" +
                "\n3-Borsh (40 TL)" +
                "\n4-Palov (20 TL" +
                "\n5-Tamam" +
                "\nSeciminiz=");
    }
}
