package _01_Hafta.gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        //string olarak verilen 2 adet kelimenin toplamini yazdirin
        String bagis1 ="500";
        String bagis2="1500";
        // int toplamBagis=Bagis1+bagis2; string olduklari icin toplanmaz

        System.out.println(bagis1+bagis2); // yanyana yazar 2 ayri kelime gibi dusundu

        int intBagis1= Integer.parseInt(bagis1);
        int intBagis2= Integer.parseInt(bagis2);

        int toplamBagis= intBagis1 + intBagis2;
        System.out.println("toplamBagis = " + toplamBagis);
    }
}
