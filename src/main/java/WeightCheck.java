import java.util.Scanner;

public class WeightCheck {

  /**
   * В инструкции по пользованию лифтом в торговом центре написано: «Не более 6 человек или не более 450 кг».
   * Перед входом в лифт установлен прибор, который подсчитывает входящих в лифт и определяет вес до входа в лифт.
   * Прибор автоматически прекращает доступ к лифту, если вход очередного человека может нарушить инструкцию.
   * Напишите программу, которая принимает с клавиатуры значения, каждое из которых - вес очередного человека, входящего в лифт.
   * Ввод данных продолжается до тех пор, пока соблюдается требование, указанное в инструкции.
   * Программа должна выводить на экран следующую итоговую информацию:
   * • количество людей, вошедших в лифт;
   * • общий их вес;
   * • причина, по которой прекращен вход людей в лифт.
   */

  private final static short MAX_WEIGHT = 450;

  public static void main(String[] args) {
    short currentWeight = 0;
    short people = 0;

    for(short person = 1; person <= 6; person++) {
      short weightOfNextPerson = new Scanner(System.in).nextShort();

      if (currentWeight + weightOfNextPerson > 450) {
        System.out.println("Количество человек: " + people + "\nОбщий вес: " + currentWeight);
        System.out.println("Вход в лифт прекращен, по скольку, максимально допустимый вес 450 кг.");
        return;
      }
      people++;
      currentWeight += weightOfNextPerson;
    }
    System.out.println("Количество человек: " + people + "\nОбщий вес: " + currentWeight);
    System.out.println("Вход в лифт прекращен, по скольку, максимально допустимое число пассажиров 6.");
  }
}
