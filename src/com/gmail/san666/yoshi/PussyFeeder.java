package com.gmail.san666.yoshi;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Создать массив, который будет отображать количество корма для котов. То есть если food[1] = 5,
 * то у черного кота под номером 1 будет пять пакетиков еды.
 * Сама задача:
 * Создать функции, которые позволяют:
 * добавить или убавить еды у конкретного кота
 * добавить или убавить еды у всех котов сразу
 * добавить или убавить еды у четных или нечетных котов
 *
 * Только надо класс подготовить, со статик массивом
 *
 * + по аналогии с задачей "угадай число"
 * цикл ввод, пока пользователь не введет число  666
 * то есть как ввел 666, то выйти из программы
 *
 * в миске не может быть меньше 0 и больше 7 пакетиков корма
 *
 * после ввода программа каждый раз выводит у кого сколько корма и меню
 *
 *
 *
 * Так. Надо как-то проинициализировать массивы. Вручную? или от пользователя?
 */

public class PussyFeeder {
    static String [] pussiesNames = new String[] {"Коко","Мими","Широ","Лаки","Кики","Момо","Люси","Куро"};
    static int [] pussiesFeeders = new int[8];
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
//ТРАБЛЫ
        while (true){
            System.out.println("Меню:");
            System.out.println("1. Покормить одного кота");//брейки
            System.out.println("2. Покормить всех котов");
            System.out.println("3. Покормить только четных котов");
            System.out.println("4. Покормить только нечетных котов");
            System.out.println("0. Выход");
            switch (scan.nextInt()){
                case 1 :
                    System.out.println("Кого будем кормить?");
                    printAllPussies();
                    int pussyIndex = scan.nextInt();
                    System.out.println("Сколько пакетиков положить?");
                    int foodCounter = scan.nextInt();
                    feedOnePussy(pussyIndex,foodCounter);
                    break;
                case 2 :
                    System.out.println("Сколько пакетиков положить?");
                    feedAllThePussies(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Сколько пакетиков положить?");
                    feedEvenOrOddPussies(true, scan.nextInt());
                    break;
                case 4 :
                    System.out.println("Сколько пакетиков положить?");
                    break;
                case 0 :
                    return;
            }
        }

        //TODO перенести этот вызов в нужное место
//        printAllThePussiesFood();
    }

    private static void printAllPussies() {
        for (int i = 0; i < pussiesFeeders.length; i++) {
            System.out.println(i + " - " + pussiesNames[i]);
        }
    }

    private static void printAllThePussiesFood() {
        for (int i = 0; i < pussiesNames.length; i++) {
            System.out.println("В кормушке " + pussiesNames[i] + " " + pussiesFeeders[i] + " пакетиков еды");
        }
    }

    private static void feedEvenOrOddPussies(boolean isEven, int foodCounter) {
    }

    private static void feedAllThePussies(int amountOfFeed) {
        for (int i = 0; i < pussiesNames.length; i++){
            feedOnePussy(i,amountOfFeed);
        }
//        циклом вызвать следующий метод 8 раз для каждой кошки
    }

    private static void feedOnePussy(int pussyIndex, int amountOfFeed) {
        if((pussiesFeeders[pussyIndex] + amountOfFeed) < 0){
            System.out.println("Нельзя сделать меньше, чем ничего. В миске пусто.");
            printAllThePussiesFood();
            return;
        }
        if ((pussiesFeeders[pussyIndex] + amountOfFeed) > 7){
            System.out.println("А киска-то не лопнет? Нельзя положить больше 7 пакетиков в одну кормушку.");
            printAllThePussiesFood();
            return;
        }
        pussiesFeeders[pussyIndex] += amountOfFeed;
        printAllThePussiesFood();
    }
}
