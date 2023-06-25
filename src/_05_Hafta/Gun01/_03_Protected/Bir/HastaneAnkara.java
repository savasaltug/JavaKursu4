package _05_Hafta.Gun01._03_Protected.Bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doctor dok1 = new Doctor();
        dok1.adi="savas";
        dok1.bolumu="Dahiliye";
        dok1.hastaneAd="Ankara Hastanesi";

        Doctor dok2 = new Doctor("Mehmet");
    }
}
