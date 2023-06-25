package _06_Hafta.Gun04._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A.mesaj = " + A.mesaj); // a'dan merhaba
        
        B b = new B();
        System.out.println("A.mesaj = " + A.mesaj); // B'den merhaba
        
        A a2 = new A();
        System.out.println("A.mesaj = " + A.mesaj); //b'den merhaba
    }
}
