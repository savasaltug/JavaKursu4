package _05_Hafta.Gun06._04_Protected.Paket2;

import _05_Hafta.Gun06._04_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    public P2Kedi(String ad, String cinsi){
        this.ad=ad;
        this.cinsi=cinsi; // defaulttan farkli olarak
        // extend edildiginde diger paketlerden de erisilebilir.
    }
}
