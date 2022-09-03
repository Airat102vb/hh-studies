package lesson2;

import java.util.Scanner;

public class Spell {

  /**
   * Дано натуральное число N. Напишите метод выводящий все цифры числа по одной,
   * в обычном порядке, разделяя их пробелами или новыми строками.
   * При решении этой задачи нельзя использовать строки, списки, массивы, циклы.
   * Разрешена только рекурсия и целочисленная арифметика.
   */

  public static void main(String[] args) {

    rec(new Scanner(System.in).nextInt(), 0);
  }

  private static void rec(int n, int from) {
    if (n == from) {
      System.out.println(n);
      return;
    }
    System.out.println(from);
    rec(n, from + 1);
  }
}
