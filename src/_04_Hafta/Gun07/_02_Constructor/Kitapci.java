package _04_Hafta.Gun07._02_Constructor;

public class Kitapci {
    // Book class yaziniz.fields: name publishYear, author.
    // 3 adet Constructor ekleyiniz.
    // Kitaplarin ozelliklerini tek bir satirda yazdiran bir metod ekleyiniz.
    // 3 adet kitabi farkli constructor olusturup, mainde yazdiriniz,

    public static void main(String[] args) {


        Kitap kit1 = new Kitap();
        kit1.name="Harry Potter";
        kit1.author="JK Rowling";
        kit1.publishYear=1997;

        Kitap kit2 = new Kitap("yuzukler",1954,"JRR Tolkien");
        Kitap kit3=new Kitap("uzum ve cay");

        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);

    }
}
