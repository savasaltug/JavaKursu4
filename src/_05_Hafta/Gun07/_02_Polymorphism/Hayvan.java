package _05_Hafta.Gun07._02_Polymorphism;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        this.name = name;
    }
    public void ses()
    {
        System.out.println("ses cikardi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
