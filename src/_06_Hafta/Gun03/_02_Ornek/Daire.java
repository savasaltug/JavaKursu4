package _06_Hafta.Gun03._02_Ornek;

public class Daire extends Sekil{
    private double yariCap;

    public Daire(double yariCap) {
        setYariCap(yariCap);
    }

    @Override
    public double alan() {
        return Math.PI*yariCap;
    }

    @Override
    public double cevre() {
        return Math.PI*yariCap*2;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }
}
