package _05_Hafta.Gun02._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String fullName;
    static  int sayac =1; // sen bir tanesin
    // static olmadan her zaman 0'la basliyordu
    // static oldugunda artik bir tane oldugundan
    // degerini korudu ve hep 1 tane artti


    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String fullName) {
        this.id=sayac++;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
