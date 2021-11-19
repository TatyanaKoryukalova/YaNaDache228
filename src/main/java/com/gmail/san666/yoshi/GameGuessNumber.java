package com.gmail.san666.yoshi;

import java.util.Random;
import java.util.Scanner;

/**
 * Пограмма загадывает случайное число от 1 до 100
 * Говорит пользователю "Угадай"
 * У пользователя 10 попыток. Программа говорит больше или меньше число (если пользователь не угадал)
 * Когда игра заканчивается, выводится загаданое число
 */
public class GameGuessNumber {

    public static void main(String[] args) {
        gameGuessNumber();
    }

    private static void gameGuessNumber() {
        Random r = new Random();
        int high = 100;
        int random = r.nextInt(high + 1);
        Scanner scan = new Scanner(System.in);

        System.out.println("Угадайте число от 0 до 100" + '\n' + "У вас 10 попыток.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Попытка: " + (i + 1));
            String userInput = scan.next();
            if (!userInput.matches("[0-9]+")) {
                System.out.println("Вы ввели не число");
                continue;
            }
            if (Integer.parseInt(userInput) > random) {
                System.out.println("Ваше число больше загаданного");
                continue;
            }
            if (Integer.parseInt(userInput) < random) {
                System.out.println("Ваше число меньше загаданного");
                continue;
            }
            System.out.println("Вы угадали с " + (i + 1) + " попытки!" +
                    '\n' + "Загаданное число: " + random);
            break;
        }
        System.out.println('\n' + "Вы не угадали." + '\n' + "Загаданное число: " + random);
    }
}
