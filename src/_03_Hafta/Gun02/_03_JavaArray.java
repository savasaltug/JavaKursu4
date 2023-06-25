package _03_Hafta.Gun02;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] dizi1 = new int[5];
        int[] dizi2 = {5,77,58,1,98,3232,45};
        System.out.println("dizi2.length = " + dizi2.length);

        String[] kelimeler = new String[5]; // 5 tane kelime saklayabilen bir dizi degiskeni
        boolean[] dizi3= new boolean[5];// 5 tane boolean saklayabilen bir dizi degiskeni
        double[] oranlar = new double[5];// 5 tane double saklayabilen bir dizi degiskeni

        for (int i = 0; i < dizi1.length; i++) {//int[] default :0
            System.out.println("dizi1 = " + dizi1[i]);


            }
        for (int i = 0; i < dizi2.length; i++) {
            System.out.println("dizi2 = " + dizi2[i]);
        }
        for (int i = 0; i < kelimeler.length; i++) {// String[] def:null
            System.out.println("kelimeler = " + kelimeler[i]);

        }
        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("dizi3 = " + dizi3[i]); // boolean[] def: false
        }
        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar = " + oranlar[i]);// double[] def:0.0
        }


    }
}
