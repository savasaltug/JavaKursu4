package _05_Hafta.Gun03._01_Enum;

public class OrnekCozum {
    enum Aylar{
        Tanimsiz, Ocak, Subat, Mart, Nisan, Mayis, Haziran, Temmuz, Agustos, Eylul, Ekim, Kasim, Aralik

    }

    public static void main(String[] args) {
        Aylar ay = Aylar.Mayis;
        switch (ay){
            case Tanimsiz:
            case Ocak:
            case Subat:
            case Ekim:
            case Mart:
            case Eylul:
            case Kasim:
            case Mayis:
            case Nisan:
            case Aralik:
            case Temmuz:
            case Agustos:
            case Haziran:
        }
        if (ay== Aylar.Agustos){
            System.out.println("zam yapildi");
        }
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        for (Aylar a : Aylar.values())
            System.out.println(a.name()+" - "+ a.ordinal());
    }
}
