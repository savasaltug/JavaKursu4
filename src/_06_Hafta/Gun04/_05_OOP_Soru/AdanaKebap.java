package _06_Hafta.Gun04._05_OOP_Soru;

public class AdanaKebap implements IFood{

    @Override
    public void taste() {
        System.out.println("Etin en guzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 75;
    }

    void marinade()
    {
        System.out.println("Et dunden ozel baharatlarla terbiye edilodi");
    }

    void grill()
    {
        System.out.println("Komur atesinde yavas yavas pisirildi");
    }

}
