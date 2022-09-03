package lesson1;

import java.util.Scanner;

public class Converter {

  /** Напишите программу, которая принимает с клавиатуры целое трехзначное положительное число и изменяет его следующим образом:
   *   • для чисел, больших 500, - переставляет местами числа единиц и сотен (вместо 672 - 276);
   *   • в остальных числах переставляются местами числа десятков и единиц (вместо 363 - 336).
   *  Программа должна вывести на экран новое значение переменной.
   */

  public static void main(String[] args) {
    short number = new Scanner(System.in).nextShort();

    if (number > 500) {
      System.out.println(new StringBuilder(Short.toString(number)).reverse());
    } else {
      String[] n = Short.toString(number).split("");
      System.out.println(new StringBuilder(n[0] + n[2] + n[1]));
    }
  }
}
