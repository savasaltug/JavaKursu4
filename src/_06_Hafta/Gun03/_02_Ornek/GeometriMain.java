package _06_Hafta.Gun03._02_Ornek;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d = new Dikdortgen(5,4);
        d.setName("Yeni diktortgen");
        d.ciz();
        System.out.println( d);

        Daire dr = new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println(dr);
    }
}
