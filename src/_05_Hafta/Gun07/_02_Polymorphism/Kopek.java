package _05_Hafta.Gun07._02_Polymorphism;

public class Kopek extends Hayvan {
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println(" Havladi ");
    }
    public void kokladi(){
        System.out.println(" kokladi ");
    }


}
