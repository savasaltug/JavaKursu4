package _05_Hafta.Gun07._03_Polymorphism;

public class Calisan extends Kisi{

    private String departman;


    public Calisan(String ad, String soyad, String gorevi, String departman) {
        super(ad, soyad, gorevi);
        setDepartman(departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "departman='" + departman + '\'' +
                "} " + super.toString();
    }
}
