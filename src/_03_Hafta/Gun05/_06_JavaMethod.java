package _03_Hafta.Gun05;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();
        merhabaYazIsme("ismet");

        cokMerhabaYaz(5);

    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dunya");
        System.out.println("merhaba dunya");

    }
    public static void merhabaYazIsme(String isim) {
        System.out.println(isim+" merhaba");

    }

    public static void cokMerhabaYaz(int miktar) {

        for (int i = 0; i < miktar; i++) {
            System.out.println(" merhaba");

        }
    }



}
