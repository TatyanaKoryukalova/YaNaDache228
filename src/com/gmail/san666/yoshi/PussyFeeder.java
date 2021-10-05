package com.gmail.san666.yoshi;

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
//TODO написать тест к классу
public class PussyFeeder {
    static String [] pussiesNames = new String[8]; //{"Коко","Мими","Широ","Лаки","Кики","Момо","Люси","Куро"};
    static int [] pussiesFeeders = new int[8];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
//TODO пункт "создать кошек"
    private static void menu() {
        while (true){
            System.out.println("Меню:" + '\n'
                    + "1. Дать имена всем кошкам" + '\n'
                    + "2. Дать имя одной кошке" + '\n'
                    + "3. Покормить одного кота" + '\n'
                    + "4. Покормить всех котов" + '\n'
                    + "5. Покормить только четных котов" + '\n'
                    + "6. Покормить только нечетных котов" + '\n'
                    + "7. Создать новую кошку" + '\n'
                    + "0. Выход");
            switch (scan.nextInt()){
                case 1 :
                    createAllPussies();
                case 2 :
                    System.out.println("Как назовём кошку?");
                    createNewPussy(scan.next());
                case 3 :
                    System.out.println("Кого будем кормить?");
                    printAllPussies();
                    int pussyIndex = scan.nextInt();
                    System.out.println("Сколько пакетиков положить? (со знаком минус, если убрать)");
                    int foodCounter = scan.nextInt();
                    feedOnePussy(pussyIndex,foodCounter);
                    printAllThePussiesFood();
                    break;
                case 4 :
                    System.out.println("Сколько пакетиков положить? (со знаком минус, если убрать)");
                    feedAllThePussies(scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 5:
                    System.out.println("Сколько пакетиков положить? (со знаком минус, если убрать)");
                    feedEvenOrOddPussies(true, scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 6 :
                    System.out.println("Сколько пакетиков положить? (со знаком минус, если убрать)");
                    feedEvenOrOddPussies(false, scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 7 :
                    System.out.println("Как зовут кошку?");
                    createNewPussy(scan.next());
                    break;
                case 0 :
                    return;
            }
        }
    }

    //TODO добавить метод, который создает новую кошку
    private static void createNewPussy(String pussyName) {
        //Что в итоге сделать то? Добавить не пустую строчку?
        /*
        В общем, не очень понятно каким образом реализовать. Ладно б это эррайлист был.
        Тут или инициализировать всех разом, или делать проверку при кормлении
        Сразу говорить пользователю сколько мест есть и сколько заняты. Это если по одному.
        Можно сделать два пункта. Всех и одну создать, а там посмотреть
         */
        int cat = 0;
        while(cat < pussiesNames.length){
            if (pussiesNames[cat] != null){
                cat++;
            } else {
                pussiesNames[cat] = pussyName;
                System.out.println("Новую кошку под номером " + cat + " зовут " + pussyName);
                return;
            }
        }
        System.out.println("Кошек слишком много");
    }//додумать

    private static void createAllPussies(){
        for (int i = 0; i < pussiesNames.length; i++) {
            System.out.println("Как назовём " + i + "кошку?");
            pussiesNames[i] = scan.next();
        }
    }


    public static void printAllPussies() {
        for (int i = 0; i < pussiesFeeders.length; i++) {
            System.out.println(i + " - " + pussiesNames[i]);
        }
    }

    //TODO отрефакторить так, чтобы методы возвращали String
    private static void printAllThePussiesFood() {
        System.out.println();
        for (int i = 0; i < pussiesNames.length; i++) {
            System.out.println("В кормушке " + pussiesNames[i] + " " + pussiesFeeders[i] + " пакетиков еды");
        }
        System.out.println();
    }
// TODO Добавить джава док комментарии к каждому методу(по поводу? работы?), сделать паблик
    private static void feedEvenOrOddPussies(boolean isEven, int foodCounter) {
        if (isEven){
            for (int i = 0; i < pussiesNames.length; i+=2) {
                feedOnePussy(i,foodCounter);
            }
        } else{
            for (int i = 1; i < pussiesNames.length; i+=2) {
                feedOnePussy(i,foodCounter);
            }
        }
    }

    public static void feedAllThePussies(int amountOfFeed) {
        for (int i = 0; i < pussiesNames.length; i++){
            feedOnePussy(i,amountOfFeed);
        }
    }

    public static void feedOnePussy(int pussyIndex, int amountOfFeed) {
        //TODO использовать механизм exception
        if((pussiesFeeders[pussyIndex] + amountOfFeed) < 0){
            System.out.println("Нельзя сделать меньше, чем ничего. В миске пусто.");
            return;
        }
        if ((pussiesFeeders[pussyIndex] + amountOfFeed) > 7){
            System.out.println("А киска-то не лопнет? Нельзя положить больше 7 пакетиков в одну кормушку." + '\n'
                    + "Не удалось покормить " + pussiesNames[pussyIndex]);
            return;
        }
        pussiesFeeders[pussyIndex] += amountOfFeed;
    }
}
