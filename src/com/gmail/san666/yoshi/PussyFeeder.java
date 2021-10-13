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
    //TODO размерность массива задает пользователь (до 4)
    static String [] pussiesNames = new String[8]; //{"Коко","Мими","Широ","Лаки","Кики","Момо","Люси","Куро"};
    static int [] pussiesFeeders = new int[8];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    /**
     * В методе "Меню" находится бесконечный цикл
     * Работа метода завершается, если пользователь при выводе меню нажимает "0"
     * Через switch реализованы пункты меню
     *
     */
    private static void menu() {
        while (true){
            System.out.println("Меню:" + '\n'
                    + "1. Дать имена всем кошкам" + '\n'
                    + "2. Дать имя одной кошке" + '\n'
                    + "3. Покормить одного кота" + '\n'
                    + "4. Покормить всех котов" + '\n'
                    + "5. Покормить только четных котов" + '\n'
                    + "6. Покормить только нечетных котов" + '\n'
                    + "0. Выход");
            switch (scan.nextInt()){
                case 1 :
                    createAllPussies();
                    System.out.println(printAllPussies());
                    break;
                case 2 :
                    System.out.println("Как назовём кошку?");
                    createNewPussy(scan.next());
                    System.out.println(printAllPussies());
                    break;
                case 3 :
                    System.out.println("Кого будем кормить?");
                    System.out.println(printAllPussies());
                    int pussyIndex = scan.nextInt();
                    printAmountQuestion();
                    int foodCounter = scan.nextInt();
                    feedOnePussy(pussyIndex,foodCounter);
                    printAllThePussiesFood();
                    break;
                case 4 :
                    printAmountQuestion();
                    feedAllThePussies(scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 5:
                    printAmountQuestion();
                    feedEvenOrOddPussies(true, scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 6 :
                    printAmountQuestion();
                    feedEvenOrOddPussies(false, scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 0 :
                    return;
            }
        }
    }

    //Есть ли вообще "предпочтение" в каком порядке лучше располагать методы?

    //Имеет ли вообще смысл выносить одну строчку в отдельный метод?
    public static void printAmountQuestion() {
        System.out.println("Сколько пакетиков положить? (со знаком минус, если убрать)");
    }

    //TODO добавить метод, который создает новую кошку
    public static void createNewPussy(String pussyName) {
        /*
        Тут или инициализировать всех разом, или делать проверку при кормлении
        Сразу говорить пользователю сколько мест есть и сколько заняты? Это если по одному.
        Можно сделать два пункта. Всех и одну создать, а там посмотреть
         */
        for (int i = 0; i < pussyName.length(); i++) {
            if (pussiesNames[1] != null){

             } else {
                pussiesNames[i] = pussyName;
                System.out.println("Новую кошку под номером " + i + " зовут " + pussyName);
                return;
            }
        }
//        int cat = 0;
//        //TODO поменять на for
//        while(cat < pussiesNames.length){
//            if (pussiesNames[cat] != null){
//                cat++;
//            } else {
//                pussiesNames[cat] = pussyName;
//                System.out.println("Новую кошку под номером " + cat + " зовут " + pussyName);
//                return;
//            }
//        }
        System.out.println("Кошек слишком много");
    }

    public static void createAllPussies(){
        System.out.println("Введи количество кошек (не больше 8)");
        int pussiesCount = 0;
        do {
            pussiesCount = scan.nextInt();
        } while (pussiesCount > 0 && pussiesCount < 5); //что это и зачем и поменять количесто кошек и нмера

        for (int i = 0; i < pussiesCount; i++) {
            System.out.println("Как назовём " + i + " кошку?");
            pussiesNames[i] = scan.next();
        }
    }

    public static String printAllPussies() {
        String result = "";
        for (int i = 0; i < pussiesFeeders.length; i++) {
            result = result + i + " - "  + pussiesNames[i] + '\n';
        }
        return  result;
    }

    //TODO отрефакторить так, чтобы методы возвращали String
    //TODO печатать тоько кошек с не пустыми именами
    public static void printAllThePussiesFood() {
        System.out.println();
        for (int i = 0; i < pussiesNames.length; i++) {
            System.out.println("В кормушке " + pussiesNames[i] + " " + pussiesFeeders[i] + " пакетиков еды");
//            System.out.println(printPussyFood(i));
        }
        System.out.println();
    }

//    public static String printPussyFood(int pussyIndex){
//        return "В кормушке " + pussiesNames[pussyIndex] + " " + pussiesFeeders[pussyIndex] + " пакетиков еды";
//    }

// TODO Добавить джава док комментарии к каждому методу, сделать паблик
    public static void feedEvenOrOddPussies(boolean isEven, int foodCounter) {
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
//    public static String feedOnePussy(int pussyIndex, int amountOfFeed) { неа
//        if ((pussiesFeeders[pussyIndex] + amountOfFeed) < 0) {
//            return "Нельзя сделать меньше, чем ничего. В миске пусто.";
//        }
//        if ((pussiesFeeders[pussyIndex] + amountOfFeed) > 7) {
//            return "А киска-то не лопнет? Нельзя положить больше 7 пакетиков в одну кормушку." + '\n'
//                    + "Не удалось покормить " + pussiesNames[pussyIndex];
//        }
//        pussiesFeeders[pussyIndex] += amountOfFeed;
//    }
}
