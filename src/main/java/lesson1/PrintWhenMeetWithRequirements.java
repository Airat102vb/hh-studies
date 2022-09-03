package lesson1;

import java.util.Scanner;

public class PrintWhenMeetWithRequirements {

  /**
   * Напишите программу, которая выводит на экран все трехзначные числа, для которых соблюдаются два условия:
   * • само число заканчивается на 0;
   * • сумма нечетных делителей этого числа тоже заканчивается на 0.
   */

  public static void main(String[] args) {
    short number = new Scanner(System.in).nextShort();

    if (number % 10 == 0 && calculate(number)) {
      System.out.println(number);
    }
  }

  private static boolean calculate(short n) {
    short res = 0;
    for (int i = 1; i <= n; i++) {
      if((n % i) == 0)
        if (i % 2 != 0) {
          res += i;
        }
    }
    return res % 10 == 0 ? true : false;
  }
}
