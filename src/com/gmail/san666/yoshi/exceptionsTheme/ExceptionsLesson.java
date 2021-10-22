package com.gmail.san666.yoshi.exceptionsTheme;

import java.util.Scanner;

public class ExceptionsLesson {
    public static void main(String[] args) {
        String userInput = inputString();
        try {
            int parsedNumber = parseNumber(userInput);
            System.out.println(parsedNumber);
        }
        catch (DoesNotContainsNumberException e){
            System.out.println("Вы ввели не число");
        }
        catch (NumberIsTooLongException e){
            System.out.println("Введенное число длиннее 2 символов");
        }
        catch (Exception e){
            System.out.println("Вы получили следующую ошибку: " + e.toString());
        }
        finally {
            System.out.println("Всем спасибо, все свободны");
        }

    }

    private  static String inputString(){
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int parseNumber (String inputString) throws DoesNotContainsNumberException, NumberIsTooLongException{
        if (!inputString.matches("[0-9]+")){
            throw new DoesNotContainsNumberException("There is wrong symbols is the input");
        }

//        try
//        {
            if (inputString.length() > 2)
                throw new NumberIsTooLongException("There is wrong symbols is the input");
//        }
//        catch (NumberIsTooLongException exception)
//        {
//            throw new RuntimeException();
//        }

        return Integer.parseInt(inputString);
    }
}
