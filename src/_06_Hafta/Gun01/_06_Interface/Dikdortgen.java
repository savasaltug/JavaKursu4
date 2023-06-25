package _06_Hafta.Gun01._06_Interface;

public class Dikdortgen implements ISekil {
    @Override
    public double cevre(double kisaKenar, double uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }

    @Override
    public double alan(double kisaKenar, double uzunKenar) {
        return kisaKenar*uzunKenar;
    }
}
