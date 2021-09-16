package com.gmail.san666.yoshi;

import java.util.Scanner;

public class StdInputOutput {
    public static void main(String[] args) {
        int num = 0;
//        switch(num){
//
//            case 1:
//                System.out.println("число равно 1");
//                break;
//            case 8:
//                System.out.println("число равно 8");
//                num++; //num++ - num = num + 1
//                break; //num+=20 - num = num + 20
//            case 9:
//                System.out.println("число равно 9");
//                break;
//            default:
//                System.out.println("число не равно 1, 8, 9");
//        }
//        if(num == 1){
//            System.out.println("Число равно 1");
//        } else if(num == 8){
//            System.out.println("Число равно 8");
//            num++;
//        } else {
//            System.out.println("Число не равно 1, 8, 9");
//        }
        //Операторы && и ||
//        if(num != 8 && num != 1 && num != 9){  //!= - не равно
//            System.out.println("Число не равно 1, 8, 9");
//        } else System.out.println("Число равно 1, 8 или 9");
//
//        if (num == 0 || num == 1){
//            System.out.println("Число равно 1 или 0");
//        } else {
//            System.out.println("Число не равно ни 1, ни 0");
//        }
        //While
//        int x = 1;
//        while (x < 100){
//            x++;
//            System.out.println(x);
//        }
        /*
        Посчитать кол-во високосных годов с 0 года до текущего
        */
//        int year = 85;
//        //int i = 0; //??
//        while (year >= 0){
//            if (year % 4 == 0){
//                System.out.println("Високосный год: " + year);
//            }
//            year--; //сделать year ++
//        }

        //тернарные операторы
        Scanner sacan = new Scanner(System.in);

        int magicTen = magic(sacan.nextInt());
        System.out.println(magicTen);





    }
    public static int magic(int x){
//        if (x==10){
//            return 1;
//        } else{
//            return 0;
//        }
        return x == 10 ? 1 : 0; //до ? идет условие,
    }                           //? - if;  : - else

    public static boolean twoNubersEqual(int x, int y){
        return true;
    }

}
