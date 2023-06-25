package _06_Hafta.Gun02._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar(310, "model 5");
        ToyotaPrius prius= new ToyotaPrius(1200, "sedan");
        Bus bus = new Bus(7000, "IVECO");

        ArrayList<Vehicle> arabalar = new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(prius);
        arabalar.add(bus);

        for (Vehicle v : arabalar){
            System.out.println("------------------------------");
            System.out.println(v.getClass().getSimpleName());
            System.out.println("-------------------------------");


            System.out.println("Model = " + v.getModel());
            System.out.println("Engine = " + v.getEngine());

            if (v instanceof TeslaCar){
                System.out.println(((TeslaCar) v).drive());
                System.out.println(((TeslaCar)v).changeBattery());
            }
            else

            if (v instanceof ToyotaPrius){
                System.out.println( ((ToyotaPrius)v).drive());
                System.out.println( (( ToyotaPrius)v).changeBattery());
                System.out.println( ((ToyotaPrius)v).changeOil());
            }
            else
            if (v instanceof Bus){
                System.out.println( ((Bus)v).drive());
                System.out.println( ((Bus)v).changeDeisel());
            }
        }
    }
}
