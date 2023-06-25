package _04_Hafta.Gun05._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        Person cal1 = new Person();
        cal1.name = "Hatice";
        cal1.surName="Demir";
        cal1.age = 30;

        Person cal2=new Person();
        cal2.name="Muhammed";
        cal2.surName="Gurdal";
        cal2.age=35;

        cal1.BilgiYazdir();
        cal2.BilgiYazdir();

        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);
        cal1.getBirthYear();
        cal2.getBirthYear();
        cal1.getInitials();
    }
}
