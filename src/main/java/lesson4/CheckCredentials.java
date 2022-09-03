package lesson4;

import java.util.Scanner;

public class CheckCredentials {

  /**
   * 1. Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
   * 2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
   * 3. Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
   * 4. Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
   * Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
   * 5. WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
   * второй принимает сообщение исключения и передает его в конструктор класса Exception.
   *
   * 6. Обработка исключений проводится внутри метода.
   * 7. Используем multi-catch block.
   * 8. Метод возвращает true, если значения верны или false в другом случае.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ввведите логин:");
    String login = scanner.nextLine();
    System.out.println("Придумайте пароль:");
    String password = scanner.nextLine();
    System.out.println("Подтвердите пароль:");
    String confirmPassword = scanner.nextLine();

    System.out.println(checkCredentials(login, password, confirmPassword));
  }

  private static boolean checkCredentials(String login, String password, String confirmPassword) {
    try {
      checkLogin(login);
      checkPassword(password, confirmPassword);
      return true;
    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  private static void checkLogin(String login) throws WrongLoginException {
    if (!login.matches("\\w")) {
      throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания.");
    }
    if (login.length() != 20) {
      throw new WrongLoginException("Длина логина должна быть меньше 20 символов");
    }
  }

  private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
    if (!password.matches("\\w")) {
      throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания");
    }
    if (password.length() != 20) {
      throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов");
    }
    if(!password.equals(confirmPassword)) {
      throw new WrongPasswordException();
    }
  }
}
