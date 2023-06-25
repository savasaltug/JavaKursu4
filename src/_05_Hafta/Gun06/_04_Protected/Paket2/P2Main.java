package _05_Hafta.Gun06._04_Protected.Paket2;

import _05_Hafta.Gun06._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p2h = new P1Hayvan();
        p2h.ad = "kopek";
        // p1h.yas default diger paketten erisilemez
        // p1h.cinsi protected diger paketten direkt erisemedim
    }
}
