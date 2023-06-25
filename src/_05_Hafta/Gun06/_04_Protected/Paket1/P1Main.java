package _05_Hafta.Gun06._04_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h = new P1Hayvan();
        p1h.ad="karakedi";// public erisildi
        p1h.yas=2; // default erisildi
        p1h.cinsi="tekir"; // protected erisildi
        //p1h.renk private, sadece kendi classindan ulasilir bu yuzden ulasamadik.
    }
}
