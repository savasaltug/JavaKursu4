package _04_Hafta.Gun07._02_Constructor;

public class Kitap {
    String name;
    int publishYear;
    String author;

    public Kitap()
    {

    }

    public Kitap(String name, int publishYear, String author)
    {
        this.name=name;
        this.publishYear = publishYear;
        this.author = author;
    }
    public  Kitap(String name)
    {
        this(name,0,"");
    }
    public String toString(){
        return name+" "+author+" "+publishYear;
    }
}
