package com.tms.autorization;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkAuthorization("daniilTMS", "12345", "12345"));

    }

    public static boolean checkAuthorization(String login, String password, String confirmPassword) {
        try {
            if (checkData(login) && checkData(password) && password.equals(confirmPassword)) {
                System.out.println("Регистрация прошла успешно!");
                return true;
            } else if (!checkData(login)) {
                throw new WrongLoginException("Вы ввели неверный формат логина!");
            } else if (!checkData(password)) {
                throw new WrongPasswordException("Вы ввели неверный формат пароля!");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и потверждённый пароль различаются!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean checkData(String data) {
        return data.matches("^[a-zA-Z0-9]+$") && data.length() < 20;
    }

}
