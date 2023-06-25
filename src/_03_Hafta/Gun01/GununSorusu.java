package _03_Hafta.Gun01;

public class GununSorusu {
    public static void main(String[] args) {
        // asagdaki goruntuyu veren programi yaziniz (yalnizca 1 yildizla)
        //    *
        //   **
        //  ***
        // ****
        //*****

        for (int i = 1; i <=5 ; i++) {
            //bosluklar burda olmali
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }


            for (int j=0; j<i; j++)
                System.out.print("*");
            System.out.println();
        }




        // sayinin simetrik oldugunu nasil anlarsin?
        // sayinin tersi kendisiyle ayni ise, 121 -> 121
        // sayinin sondaki basamagini alacaksin, ve onu yeni basamak geldikce 10 ile carpip
        // yeni basamakla toplayacaksin.
        // 12521  -> 1 -> 1*10+2   -> 12*10+5  -> 125*10+2  ->1252*10+1  ->12521
    }
}
