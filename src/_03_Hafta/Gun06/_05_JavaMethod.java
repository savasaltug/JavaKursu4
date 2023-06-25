package _03_Hafta.Gun06;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=12;
        int s3=32;


        int sonuc1=toplambul(5,6);
        int sonuc2=toplambul(s1,s2,s3);

        String ad ="savas";
        String soyad="altug";
        String sonuc3=toplambul(ad,soyad);
        System.out.println("sonuc3 = " + sonuc3);
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
    }
    public static int toplambul(int s1, int s2){
        return s1+s2;
    }

    public static int toplambul(int s1, int s2, int s3) {
        return s1 + s2 + s3;
    }

    public static String toplambul(String ad, String soyad) {
        return ad+ " "+soyad;
    }
}
