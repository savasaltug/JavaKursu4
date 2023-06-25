package _05_Hafta.Gun06._04_Protected.Paket1;

public class P1Hayvan {
    public String ad; // her paketten , her yerden ulasilir
    int yas; // sadece bulundugu paketten ulasilir
    protected String cinsi; // dufault gibi, diger paketlerden erisimle ilgili bir secenegi var
    private String renk; // bulundugu classdan erisilebilir.
}
