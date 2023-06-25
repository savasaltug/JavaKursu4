package _06_Hafta.Gun03._02_Ornek;

public abstract class Sekil {
    private String name;

    public abstract double alan(); /// soyut - abstract
    public abstract double cevre(); // soyut

    public void ciz()
    {
        System.out.println(name+" isimli sekil cizildi.");
    }

    @Override
    public String toString() {
        return "Sekil:" +
                "\nname='" + name + '\'' +
                "\nalan=' "+ alan() +'\''+
                "\ncevre=' " + cevre()+ '\''+
                "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
