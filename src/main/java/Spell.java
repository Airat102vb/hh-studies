import java.util.Scanner;

public class Spell {

  /**
   * Дано натуральное число N. Напишите метод выводящий все цифры числа по одной,
   * в обычном порядке, разделяя их пробелами или новыми строками.
   * При решении этой задачи нельзя использовать строки, списки, массивы, циклы.
   * Разрешена только рекурсия и целочисленная арифметика.
   */

  public static void main(String[] args) {

    int natural = new Scanner(System.in).nextInt();

    int divider = 10;
    boolean maxDivider = false;
    while (!maxDivider) {
      if (natural / divider == 0) {
        maxDivider = true;
        divider /= 10;
      } else {
        divider *= 10;
      }
    }

    while (divider != 1) {
      int number = natural / divider;
      System.out.println(number);
      natural -= number * divider;
      divider /= 10;
    }
    System.out.println(natural);
  }
}
