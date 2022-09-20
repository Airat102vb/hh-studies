package lesson5;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ведите любое число, что-бы проверить что остаток от деления на 13 = 0:");
    System.out.println(testInt.test(scanner.nextInt()));
    System.out.println();

    System.out.println("Ведите три дробных числа, что-бы найти дискрименант:");
    System.out.println("Введите дробное число A:");
    double a = scanner.nextDouble();
    System.out.println("Введите дробное число B:");
    double b = scanner.nextDouble();
    System.out.println("Введите дробное число C:");
    double c = scanner.nextDouble();

    System.out.println(calculateDiscriminant.calculate(a, b, c));
  }

  private static Predictable<Integer> testInt = number -> number % 13 == 0;

  //D = b^2 — 4ac
  private static Calculable<Double, Double, Double> calculateDiscriminant = (a, b, c) -> Math.sqrt(b) - 4 * a * c;
}
