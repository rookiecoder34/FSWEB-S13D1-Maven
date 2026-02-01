package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isCatPlaying(true,46));
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

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if(firstAge > 13 && firstAge<19){
            return true;
        }else if(secondAge >= 13 && secondAge<=19){
            return true;
        }else if(thirdAge >= 13 && thirdAge<=19){
            return true;
        }else {
            return false;
        }
        }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(!isSummer){
            if(temp>=25 && temp<=35){
                return true;
            }else {
                return false;
            }

            }
        if(isSummer){
            if(temp>=35 && temp<=45){
                return true;
            }else {
                return false;
            }

        }else {
            return false;
        }

    }

    public static double area(double width, double height) {
        return width * height;
    }

    public static double area(double radius) {
        return radius * radius;
    }


}
