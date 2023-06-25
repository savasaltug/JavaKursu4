package _01_Hafta.gun04;

public class _06_Ornek {
    public static void main(String[] args) {


        // kisinin agirligini double, boyunu int olarak degerler veriniz.
        //ve bir satirda boyunuz ... ve kilonuz ... seklinde yaziniz.
        // vucut kitle indexini de bularak yazdiriniz ( kg / boy * boy)

        double kg = 83.5;
        int boy = 183;

        double kitleIdex = kg / (boy * boy) ; // widening genisletme yonunde
        System.out.println("kitleIdex = " + kitleIdex);
        System.out.println("boyunuz="+boy+", kilonuz="+kg);

        int kitleIndex2 = (int)kg / (boy * boy);// veri kaybi olustu narrow daraltma yonunde
        System.out.println("kitleIndex2 = " + kitleIndex2);
    }
}
