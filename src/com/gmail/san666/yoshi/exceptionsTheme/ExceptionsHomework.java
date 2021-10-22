package com.gmail.san666.yoshi.exceptionsTheme;

import java.util.Scanner;

/**
 * Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
 * Login должен содержать только латинские буквы. Длина login должна быть меньше 20 символов.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Password должен содержать только латинские буквы. Длина password должна быть меньше 20 символов.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Обработка исключений проводится внутри метода. Используем multi-catch block.
 * Метод возвращает true, если значения верны или false в другом случае
 *
 * Для проверки строки, содержит ли она только латинские символы, можно использовать регулярное выражение:
 * input.matches ("[a-zA-Z]+\\.?");
 */
public class ExceptionsHomework {
    static String login;
    static String password;
    static String confirmPassword;

    public static void main(String[] args) {
        inputLoginData();
        boolean isLoginDataValid = false;
        try{
             isLoginDataValid = verificationInput(login,password,confirmPassword);
        }
        catch (WrongLoginException e){
            System.out.println("Введенный логин содержит недопустимые символы либо слишком длинный");
        }
        catch (WrongPasswordException e){
            System.out.println("Введенный пароль содержит недопустимые символы либо слишком длинный");
        }
        catch (ConfirmDoesNotMatchException e){
            System.out.println("Пароль и подтверждение не совпадают");
        }
        catch (Exception e){
            System.out.println("Вы получили следующую ошибку: " + e.toString());
        }
        finally {
            if (isLoginDataValid){
                System.out.println("Логин и пароль подходят под требования");
            }
        }

    }

    public static void inputLoginData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин:");
        login = scan.next();
        System.out.println("Введите пароль:");
        password = scan.next();
        System.out.println("Подтвердите пароль:");
        confirmPassword = scan.next();
    }

    public static boolean verificationInput(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException, ConfirmDoesNotMatchException {
        if (!login.matches("[a-zA-Z]+\\.?") || (login.length() >= 20)){
            throw new WrongLoginException("There is wrong symbols is the input");
        }
        if (!password.matches("[a-zA-Z]+\\.?") || password.length() >= 20){
            throw new WrongPasswordException("There is wrong symbols is the input");
        }
        if (!confirmPassword.equals(password)){
            throw new ConfirmDoesNotMatchException("Confirm password does not match");
        }
        return  true;
    }
}
