package com.gmail.san666.yoshi;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
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
    static String [] cats = new String[8];
    static int [] food = new int[8];
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        createPussies(); //user gives names to pussies
        listAllThePussies();
        feedOnePussy(5,3); //write
        feedAllThePussies(2); //write
        feedEvenOrOddPussies(); //write
        amountOfFeeds();
//        System.out.println(Arrays.asList(cats).indexOf("5")); - receive index of a certain pussy
    }

    private static void listAllThePussies() {
        for(String item : cats){
            System.out.println("Name of pussy is " + item );
        }

    }

    private static void createPussies() {
        for(int i = 0; i < cats.length; i++){
            System.out.println("Give name for " + (i+1) + " pussy");
            cats[i] = scan.nextLine();
        }
        scan.close();
    }

    private static void amountOfFeeds() {
    }

    private static void feedEvenOrOddPussies() {
    }

    private static void feedAllThePussies(int amountOfFeed) {
        for (int i = 0; i < cats.length; i++){
            feedOnePussy(i,amountOfFeed);
        }
//        циклом вызвать следующий метод 8 раз для каждой кошки
    }

    private static void feedOnePussy(int pussyIndex, int amountOfFeed) {
        if((food[pussyIndex] + amountOfFeed) < 0){
            System.out.println("Нельзя сделать меньше, чем ничего");
            System.out.println("Сейчас в кормушке " + cats[pussyIndex] + " " + food[pussyIndex] + " пакетиков");
            return;
        }
        if ((food[pussyIndex] + amountOfFeed) > 7){
            System.out.println("А киска-то не лопнет? Нельзя положить больше 7 пакетиков в одну кормушку");
            //Может с этим что-то сделать? v
            System.out.println("Сейчас в кормушке " + cats[pussyIndex] + " " + food[pussyIndex] + " пакетиков");
            return;
        }
        food[pussyIndex] += amountOfFeed;
//        System.out.println(food[pussyIndex]);
        System.out.println("Сейчас в кормушке " + cats[pussyIndex] + " " + food[pussyIndex] + " пакетиков");

    }//ну как-то так примерно, посмотреть еще
}
