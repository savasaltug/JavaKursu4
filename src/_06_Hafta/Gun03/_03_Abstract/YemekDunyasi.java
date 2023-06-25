package _06_Hafta.Gun03._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava b = new Baklava();
        b.madeIn();
        b.taste();

        GreekSalad g = new GreekSalad();
        g.setName("GreekSalad");
        g.madeIn();
        g.taste();

        CheesCake c = new CheesCake();
        c.madeIn();
        c.taste();

        SezarSalad s = new SezarSalad();
        s.setName("Sezar Salad");
        s.madeIn();
        s.taste();
    }
}
