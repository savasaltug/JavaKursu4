package _05_Hafta.Gun01.Soru;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

    void paraYatir(int yatanPara)
    {
        yatan += yatanPara;
        bakiye+= yatanPara;
    }
    void paraCek(int cekilenPara)
    {
        cekilen += cekilenPara;
        bakiye+= cekilenPara;
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
