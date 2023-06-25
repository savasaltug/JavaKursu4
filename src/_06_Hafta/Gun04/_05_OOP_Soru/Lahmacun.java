package _06_Hafta.Gun04._05_OOP_Soru;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Ince ve citir ");
    }

    @Override
    public double ucret() {
        return 40;
    }
    void dough()
    {
        System.out.println("Mayali hamur hazirlandi");
    }

    void addMeat()
    {
        System.out.println("Ozel kiyma eklendi");
    }
    void bake()
    {
        System.out.println("Odun atesinde pisirildi");
    }
}
