package _05_Hafta.Gun01._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1 = new Calisan();
        cal1.id=1;
        cal1.name= "savas";
        cal1.surname= "altug";
        // cal1.password = "1234";
        // arti private kendi paketinde bile cagirilamaz
        cal1.sifreAta("1234");
        cal1.sifreAta("M123_asd4146");
        cal1.sifreGoster();
    }
}
