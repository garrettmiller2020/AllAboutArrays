package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);

        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();
        Pattern5();
    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1(){
        for (int rows = 0; rows <6; rows++){

            for (int columns = 0; columns <6; columns++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void Pattern2() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print(rows);
            }

            System.out.println();
        }
    }

    public static void Pattern3(){
        for (int rows = 0; rows <6; rows++){

            for (int columns = 1; columns <= 6; columns++){
                System.out.print(columns);
            }

            System.out.println();
        }
    }

    public static void Pattern4() {
        for (int rows = 1; rows <=7; rows++){

            for (int columns = 1; columns <= rows ; columns++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void Pattern5(){
        for (int rows = 1; rows <7; rows++){

            for (int columns = 1; columns <= rows; columns++){
                System.out.print(columns);
            }

            System.out.println();
        }
    }





}
