package _06_Hafta.Gun02._01_Soru;

public class Vehicle {
    private double engine;
    private String model;

    public Vehicle(double engine, String model) {
        this.engine = engine;
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", model='" + model + '\'' +
                '}';
    }
}
