package com.gmail.san666.yoshi.basicJavaСoncepts;

import java.util.Scanner;

public class LoopsAndConditionalExpressions {
    public static void main(String[] args) {
        int num = 0;
        Scanner sacan = new Scanner(System.in); //Число вводит пользователь с консоли

//                               Switch

        conditionalExpressions(num);

//                          Операторы && и ||

        comparisonsOperators(num);

//                                While
        loops();



//                          Тернарные операторы


        int magicTen = magic(sacan.nextInt());
        System.out.println(magicTen);

//                              Задача про время
        System.out.println("Введите время в часах");
        int hour = sacan.nextInt();
        taskConditionalExpressionsTime(hour);

//                  Задача с непрерывнымвводом чисел
        taskInputNumbers();



    }

    public static void conditionalExpressions(int num){

//        if(num == 1){
//            System.out.println("Число равно 1");
//        } else if(num == 8){
//            System.out.println("Число равно 8");
//            num++;
//        } else {
//            System.out.println("Число не равно 1, 8, 9");
//        }
//                          Эквиваленытный код ниже
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;                  //num++ - num = num + 1
                break;                  //num+=20 - num = num + 20
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
    }

    public static void taskConditionalExpressionsTime(int hour){
        /*написать
        если время (hour >24 || hour < 0)
        вывести(вернуть) : время неверное!
        если время больше 21 или hour или меньше 6

        вывести(вернуть) "Спокойной ночи
        если время больше или равно 15)
        вывести(вернуть) "Хорошего верчер";
        если время больше или равно 11)
        вывести(вернуть) "Хорошего дня!
        В остальынх случаях
        вывести(вернуть) Хорошеего утро;
        }
        */
        if (hour > 24 || hour < 0){                             //drop else and add return
            System.out.println("Время неверное!");
            return;                                             //just several "if"
        }
        if (hour > 21 || hour < 6){                             // return interrupts work
            System.out.println("Спокойной ночи!");
            return;
        }
        if(hour >= 15){
            System.out.println("Хорошего верчера!");
            return;
        }
        if (hour >= 11){
            System.out.println("Хорошего дня!");
            return;
        }
            System.out.println("Хорошего утра!");



    }


    public static void comparisonsOperators(int num){

//        != - оператор сравнения "не равно"
//        && - быстрый оператор "и". Возвращает true только тогда, когда все выражения истинны
//        || - быстрый "или". Возвращает false только тогда, когда все выражения ложны

        if(num != 8 && num != 1 && num != 9){
            System.out.println("Число не равно 1, 8, 9");
        } else System.out.println("Число равно 1, 8 или 9");

        if (num == 0 || num == 1){
            System.out.println("Число равно 1 или 0");
        } else {
            System.out.println("Число не равно ни 1, ни 0");
        }

    }

    public static void loops(){

        int counter = 1;
        while (counter < 100){
            counter++;
            System.out.println(counter);
        }

        /*  Задача
            Посчитать кол-во високосных годов с 0 года до текущего
        */
        int year = 85;                //текущий год, который мы сами выбрали
        while (year >= 0){
            if (year % 4 == 0){
                System.out.println("Високосный год: " + year);
            }
            year--;
        }
        /* Задание:
         *  Поменять код таким образом, чтобы результат остался верным, но
         *  в конце было year ++
         * */
    }

    public static void taskInputNumbers(){
        /*Организовать беспрерывный ввод чисел с клавиатуры,
        пока пользователь не введёт 0.
        После ввода нуля, показать на экран количество чисел,
        которые были введены, их общую сумму и среднее арифметическое.
        Подсказка: необходимо объявить переменную-счетчик,
        которая будет считать количество введенных чисел,
        и переменную, которая будет накапливать общую сумму чисел.*/
        int counter = 0;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        while(scan.nextInt() != 0){

        }
    }

    public static int magic(int x){
//        if (x==10){
//            return 1;
//        } else{
//            return 0;
//        }
//        Эквивалентный код
//        до ? идет условие
//        ? - if;  : - else
        return x == 10 ? 1 : 0;
    }

}
