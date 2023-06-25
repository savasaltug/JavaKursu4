package _06_Hafta.Gun01._05_Interface;

public class Test implements IGosterir,IYazdirir{
    @Override
    public void goster() {
        System.out.println("gosterdi");

    }

    @Override
    public void yaz() {
        System.out.println("yazdirdi");

    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }
}
