package _03_Hafta.Gun01;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // asagiddaki goruntuyu veren programi yazin(yalnizca 1 yildiz kullanarak)
        //*
        //**
        //***
        //****
        //*****
        //*****
        //****
        //***
        //**
        //*
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j<i; j++ ){
                System.out.print(" * ");

            }
            System.out.println();
            if (i == 5){
                for (int a = 5; a >= 1; a--) {
                    for (int j = 0; j<a; j++ ){
                        System.out.print(" * ");

                    }
                    System.out.println();

                }
            }
        }
    }
}
