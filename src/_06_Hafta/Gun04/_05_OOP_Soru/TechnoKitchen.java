package _06_Hafta.Gun04._05_OOP_Soru;

public class TechnoKitchen {
    public static void hazirla(IFood f)
    {
        System.out.println(f.getClass().getSimpleName());
        if (f instanceof AdanaKebap)
        {
            ((AdanaKebap)f).marinade();
            ((AdanaKebap)f).grill();
        }
        else
        if (f instanceof Lahmacun)
        {
            ((Lahmacun)f).dough();
            ((Lahmacun)f).addMeat();
            ((Lahmacun)f).bake();
        }
        else
        if (f instanceof Borsh)
        {
            ((Borsh)f).boil();
            ((Borsh)f).eatTomarrow();
        }
        else
        if (f instanceof Palov)
        {
            ((Palov)f).fry();
            ((Palov)f).boil();
        }
        f.taste();
        System.out.println();
    }
}
