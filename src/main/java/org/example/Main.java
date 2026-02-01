package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(!isBarking){
            return false;
        }
        if(clock<0||clock>23) {
            return false;
        }else if(clock<8 || clock>20){
            return true;
        }else {
            return false;
        }


    }
/*
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

    }

    public static double area(double width, double height) {

    }

    public static double area(double radius) {

    }
    */

}
