package com.sparta.lm;

public class Speed {
    public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {
        double finalSpeed = initialSpeed;
        for (int i=0; i<inclinations.length; i++) {

                finalSpeed = finalSpeed - inclinations[i];
                if (finalSpeed <= 0) {
                    return 0;
                }


        }
        return finalSpeed;
    }

    public static void main(String[] args){
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, 60, 0 }));
    }
}
