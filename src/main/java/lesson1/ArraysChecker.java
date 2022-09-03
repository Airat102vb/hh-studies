package lesson1;

import java.util.Scanner;

public class ArraysChecker {

  /**
   * Напишите программу, которая формирует два массива (не обязательно одинакового размера) целых чисел.
   * Программа возвращает массив значений, которые присутствуют в первом массиве, но не присутствуют во втором.
   *
   * (starred)
   * Программа возвращает двумерный массив значений. В первом кортеже массив значений, которые присутствуют впервом массиве, но не присутствуют во втором.
   * Во втором кортеже массив значений, которые присутствуют во втором массиве, но не присутствуют в первом.
   */

  public static void main(String[] args) {
    int[] firstArray = fillAnArray(1);
    int[] secondArray = fillAnArray(2);

    int[][] result = getResult(firstArray, secondArray);
  }

  private static int[] fillAnArray(int arrayNumber) {
    System.out.println(String.format("Введите длину %s-го массива: ", arrayNumber));
    int[] temporaryArray = new int[new Scanner(System.in).nextInt()];
    System.out.println(String.format("Заполните %s-й массив целыми числами (Для завершения ввода введите любой не числовой символ): ", arrayNumber));
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < temporaryArray.length; i++) {
      temporaryArray[i] = scanner.nextInt();
    }
    return temporaryArray;
  }

  private static int[][] getResult(int[] first, int[] second) {
    int[] a = checkPresent(first.clone(), second.clone());
    int[] b = checkPresent(second.clone(), first.clone());
    return new int[][]{a, b};
  }

  private static int[] checkPresent(int[] first, int[] second) {
    int[] temp = new int[first.length];
    boolean isPresent = false;
    short i = 0;
    for (int f = 0; f < first.length; f++) {
      for (int s : second) {
        if (first[f] == s) {
          isPresent = true;
          break;
        }
        isPresent = false;
      }
      if (!isPresent) {
        temp[i] = first[f];
        isPresent = false;
        i++;
      }
    }
    return temp;
  }
}
