package _06_Hafta.Gun03._01_Abstract;
// 2'si bir arada => 1 interface ve 1 parent class = abstract class( sadece birer tane olacak )
public abstract class BinekOto {
    private String marka;
    private  int uretimYili;
    private int vitesAdedi;


    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        this.marka = marka;
        this.uretimYili = uretimYili;
        this.vitesAdedi = vitesAdedi;
    }
    abstract int HizlanmaSuresi();

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }

    @Override
    public String toString() {
        return "BinekOto{" +
                "marka='" + marka + '\'' +
                ", uretimYili=" + uretimYili +
                ", vitesAdedi=" + vitesAdedi +
                '}';
    }
}
