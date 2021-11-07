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
 * <p>
 * Класс нужно подготовить со статик массивом
 * <p>
 * + по аналогии с задачей "угадай число"
 * цикл ввод, пока пользователь не введет число  666
 * то есть как ввел 666, то выйти из программы
 * <p>
 * в миске не может быть меньше 0 и больше 7 пакетиков корма
 * <p>
 * после ввода программа каждый раз выводит у кого сколько корма и меню
 * <p>
 * <p>
 * <p>
 * Так. Надо как-то проинициализировать массивы. Вручную? или от пользователя?
 */
public class PussyFeeder {
    static String[] pussiesNames;
    static int[] pussiesFeeders;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Сколько у вас кошек?");
        int pussiesCounter = scan.nextInt();
        pussiesNames = new String[pussiesCounter];
        pussiesFeeders = new int[pussiesCounter];

        while (true) {
            System.out.println("Меню:" + '\n'
                    + "1. Дать имена всем кошкам" + '\n'
                    + "2. Дать имя одной кошке" + '\n'
                    + "3. Покормить одного кота" + '\n'
                    + "4. Покормить всех котов" + '\n'
                    + "5. Покормить только четных котов" + '\n'
                    + "6. Покормить только нечетных котов" + '\n'
                    + "7. Покзать всех котов" + '\n'
                    + "0. Выход");
            switch (scan.nextInt()) {
                case 1:
                    createAllPussies();
                    break;
                case 2:
                    System.out.println("Как назовём кошку?");
                    createNewPussy(scan.next());
                    break;
                case 3:
                    System.out.println("Кого будем кормить?");
                    printAllPussies();
                    int pussyIndex = scan.nextInt();
                    printAmountQuestion();
                    int foodCounter = scan.nextInt();
                    feedOnePussy(pussyIndex, foodCounter);
                    printAllThePussiesFood();
                    break;
                case 4:
                    printAmountQuestion();
                    feedAllThePussies(scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 5:
                    printAmountQuestion();
                    feedEvenOrOddPussies(true, scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 6:
                    printAmountQuestion();
                    feedEvenOrOddPussies(false, scan.nextInt());
                    printAllThePussiesFood();
                    break;
                case 7:
                    printAllPussies();
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void printAmountQuestion() {
        System.out.println("Сколько пакетиков положить? (со знаком минус, если убрать)");
    }

    /**
     * В данном случае мы добавляем кошку в массив с четко заданной размерностью.
     * В методе ниже мы проверяем наличие свободных ячеек, в первую такую кладем кошку
     * Подразумевается что массив заполняется с начала без пропусков
     */
    public static void createNewPussy(String pussyName) {
        for (int i = 0; i < pussyName.length(); i++) {
            if (pussiesNames[i] == null) {
                pussiesNames[i] = pussyName;
                System.out.println("Новую кошку под номером " + i + " зовут " + pussyName);
                return;
            }
        }
        System.out.println("Всем кошкам уже дали имена. Не удалось назвать кошку.");
    }

    public static void createAllPussies() {
        for (int i = 0; i < pussiesNames.length; i++) {
            System.out.println("Введите имя для " + i + " кошки");
            pussiesNames[i] = scan.next();
        }
    }

    /**
     * В методах ниже печатаем только кошек с не null именами
     */
    public static void printAllPussies() {
        String result = "";
        for (int i = 0; i < pussiesFeeders.length; i++) {
            if (pussiesNames[i] != null) {
                result = result + i + " - " + pussiesNames[i] + '\n';
            } else {
                System.out.println(result + '\n');
                return;
            }
        }
        System.out.println(result + '\n');
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

