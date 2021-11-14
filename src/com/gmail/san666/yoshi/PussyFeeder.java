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
 * Класс нужно подготовить со статик массивом
 * + по аналогии с задачей "угадай число"
 * цикл ввод, пока пользователь не введет число  666
 * то есть как ввел 666, то выйти из программы
 * в миске не может быть меньше 0 и больше 7 пакетиков корма
 * После ввода программа каждый раз выводит у кого сколько корма и меню
 */
public class PussyFeeder {
    static String[] pussiesNames;
    static int[] pussiesFeeders;
    static Scanner scan = new Scanner(System.in);
    static final String inputDoesNotContainsNumberMessage = "Вы ввели не целое число";
    static final String amountFeedQuestion = "Сколько пакетиков положить? (со знаком минус, если убрать)";


    public static void main(String[] args) {
        menu();
    }

    /**
     * В данном методе проводим инициализацию
     * Пользователь задает количество кошек и дает им имена
     * Это необходимо для дальнейшей работы
     */
    public static void pussiesInitialization() {
        do {
            System.out.println("Сколько у   вас кошек?");
            if (!scan.hasNextInt()) {
                System.out.println("Вы ввели не число. Попробуйте снова");
                continue;
            }
            int pussiesCounter = scan.nextInt();
            pussiesNames = new String[pussiesCounter];
            pussiesFeeders = new int[pussiesCounter];
            createAllPussies();
            return;
        } while (true);
    }

    private static void menu() {
        pussiesInitialization();

        while (true) {
            printMenu();
            switch (scan.next()) {
                case "1":
                    feedOnePussyPoint();
                    break;
                case "2":
                    feedAllThePussiesPoint();
                    break;
                case "3":
                    feedEverOrOddPussiesPoint(true);
                    break;
                case "4":
                    feedEverOrOddPussiesPoint(false);
                    break;
                case "5":
                    printAllPussies();
                    break;
                case "666":
                    return;
                default:
                    System.out.println("Такой команды не существует");
            }
        }
    }

    private static void feedEverOrOddPussiesPoint(boolean isEven) {
        System.out.println(amountFeedQuestion);
        if (!scan.hasNextInt()) {
            System.out.println(inputDoesNotContainsNumberMessage);
            scan.next();
            return;
        }
        feedEvenOrOddPussies(isEven, scan.nextInt());
        printAllThePussiesFood();
    }

    private static void feedAllThePussiesPoint() {
        System.out.println(amountFeedQuestion);
        if (!scan.hasNextInt()) {
            System.out.println(inputDoesNotContainsNumberMessage);
            scan.next();
            return;
        }
        feedAllThePussies(scan.nextInt());
        printAllThePussiesFood();
    }

    private static void feedOnePussyPoint() {
        System.out.println("Кого будем кормить?");
        printAllPussies();
        if (!scan.hasNextInt()) {
            System.out.println(inputDoesNotContainsNumberMessage);
            scan.next();
            return;
        }
        int pussyIndex = scan.nextInt();
        if (pussyIndex < 0 && pussyIndex > (pussiesNames.length - 1)) {
            System.out.println("Такой кошки нет");
            return;
        }
        System.out.println(amountFeedQuestion);
        if (!scan.hasNextInt()) {
            System.out.println(inputDoesNotContainsNumberMessage);
            scan.next();
            return;
        }
        int foodCounter = scan.nextInt();
        feedOnePussy(pussyIndex, foodCounter);
        printAllThePussiesFood();
    }

    private static void printMenu() {
        System.out.println("Меню:" + '\n'
                + "1. Покормить одного кота" + '\n'
                + "2. Покормить всех котов" + '\n'
                + "3. Покормить только четных котов" + '\n'
                + "4. Покормить только нечетных котов" + '\n'
                + "5. Покзать всех котов" + '\n'
                + "666. Выход");
    }

    public static void createAllPussies() {
        for (int i = 0; i < pussiesNames.length; i++) {
            System.out.println("Введите имя для " + i + " кошки");
            pussiesNames[i] = scan.next();
        }
    }

    public static void printAllPussies() {
        for (int i = 0; i < pussiesNames.length; i++) {
            System.out.println(i + " - " + pussiesNames[i] + '\n');
        }
    }

    public static void printAllThePussiesFood() {
        String result = "";
        for (int i = 0; i < pussiesNames.length; i++) {
            if (pussiesNames[i] != null) {
                result = result + "В кормушке " + pussiesNames[i] + " " + pussiesFeeders[i] + " пакетиков еды" + '\n';
            } else {
                System.out.println(result);
                return;
            }
        }
        System.out.println(result);
    }

    public static void feedEvenOrOddPussies(boolean isEven, int foodCounter) {
        if (isEven) {
            for (int i = 0; i < pussiesNames.length; i += 2) {
                feedOnePussy(i, foodCounter);
            }
        } else {
            for (int i = 1; i < pussiesNames.length; i += 2) {
                feedOnePussy(i, foodCounter);
            }
        }
    }

    public static void feedAllThePussies(int amountOfFeed) {
        for (int i = 0; i < pussiesNames.length; i++) {
            feedOnePussy(i, amountOfFeed);
        }
    }

    public static void feedOnePussy(int pussyIndex, int amountOfFeed) {
        if (pussyIndex < 0 && pussyIndex > pussiesNames.length - 1) {
            System.out.println("Такого кота нет. Не удалось никого покормить.");
            return;
        }
        if ((pussiesFeeders[pussyIndex] + amountOfFeed) < 0) {
            System.out.println("Нельзя сделать меньше, чем ничего. В миске пусто.");
            return;
        }
        if ((pussiesFeeders[pussyIndex] + amountOfFeed) > 7) {
            System.out.println("А киска-то не лопнет? Нельзя положить больше 7 пакетиков в одну кормушку." + '\n'
                    + "Не удалось покормить " + pussiesNames[pussyIndex]);
            return;
        }
        pussiesFeeders[pussyIndex] += amountOfFeed;
    }
}

