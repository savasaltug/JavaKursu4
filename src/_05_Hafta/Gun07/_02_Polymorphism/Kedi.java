package _05_Hafta.Gun07._02_Polymorphism;

public class Kedi extends Hayvan{
    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println(" miyavladi ");
    }
    public void tirmaladi(){
        System.out.println(" tirmaladi ");
    }


}
