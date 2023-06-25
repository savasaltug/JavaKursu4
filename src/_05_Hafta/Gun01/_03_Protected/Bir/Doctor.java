package _05_Hafta.Gun01._03_Protected.Bir;

public class Doctor {
    protected  String adi; // default ile ayni
    String bolumu; // default
    private  String SicilNo; // private
    public String hastaneAd; // public

    Doctor(){ // default constructor

    }

    public Doctor(String adi)
    {
        this.adi=adi;
    }
}
