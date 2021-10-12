package com.gmail.san666.yoshi;

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
    static String login;//стоит ли оббъявлять здесь? или все таки где-то в мэине
    static String password;
    static String confirmPassword;

    public static void main(String[] args) {
        inputLoginData();
        boolean isLoginDataValid = false;
        try{
             isLoginDataValid = verificationInput(login,password,confirmPassword);
        }
        catch (WrongLoginException e){
            System.out.println("Wrong login");
        }
        catch (WrongPasswordException e){
            System.out.println("Wrong pass");
        }
        catch (ConfirmDoesNotMatch e){
            System.out.println("Wrong confirm");
        }
        catch (Exception e){
            System.out.println("You get " + e.toString());
        }
        finally {
            if (isLoginDataValid){
                System.out.println("Valid login & password");
            }
        }

    }

    public static void inputLoginData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        login = scan.next();
        System.out.println("Enter your password");
        password = scan.next();
        System.out.println("Confirm your password");
        confirmPassword = scan.next();
    }

    public static boolean verificationInput(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException, ConfirmDoesNotMatch {
        if (!login.matches("[a-zA-Z]+\\.?")){
            throw new WrongLoginException("There is wrong symbols is the input");
        }
        if (!password.matches("[a-zA-Z]+\\.?")){
            throw new WrongPasswordException("There is wrong symbols is the input");
        }
        if (!confirmPassword.equals(password)){
            throw new ConfirmDoesNotMatch("Confirm password does not match");
        }
        return  true; //ну вот тут еще подумать чего возвращать. отдельную переменную завести?
    }
}
