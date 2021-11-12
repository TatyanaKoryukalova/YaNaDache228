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
        int userNumber;

        for (int i = 0; i < 10; i++) {
            System.out.println("Угадайте число от 0 до 100" + '\n' + "У вас 10 попыток.");
            System.out.println("Попытка: " + (i+1));
            userNumber = scan.nextInt();
            if (userNumber > random) {
                System.out.println("Ваше число больше загаданного");
                continue;
            }
            if(userNumber < random){
                System.out.println("Ваше число меньше загаданного");
                continue;
            }
            System.out.println("Вы угадали с " + (i+1) + " попытки!" +
                    '\n' + "Загаданное число: " + random);
            return;
        }
        System.out.println('\n' + "Вы не угадали." + '\n' + "Загаданное число: " + random);
    }
}
