package _04_Hafta.Gun06._02_Ornek;

public class Soru {
    // Math sinifindaki metodlardan 5 tanesini
    // kendi isimlendirmenizle ayri bir sinifta yazarak,
    //(kendi metodunuzun icinde Math.fonksiyonlarini kullanabilirsiniz.)
    // mainden nesne olusturmadan direkt kullanilmasini saglatacak ornek
    // kullanimlarini yaziniz.
    public static void main(String[] args) {
        int max = MyMath.getMax(4,6);
        int min = MyMath.getMin(4,6);
        int rnd = MyMath.getRandom(10);
        double usSonuc = MyMath.getUsAl(2,3);
        double kareKok = MyMath.getKareKok(16);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("usSonuc = " + usSonuc);
        System.out.println("kareKok = " + kareKok);
    }
}
