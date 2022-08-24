import java.util.Scanner;

public class CheckPosition {

  /**
   * Напишите метод, который получает следующие параметры: координаты центра круга, радиус круга и координаты некой точки.
   * Метод должен проверить, находится ли данная точка внутри круга.
   */

  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] center = new int[2];
    System.out.println("Введите координату X середины круга:");
    center[0] = scanner.nextInt();
    System.out.println("Введите координату Y середины круга:");
    center[1] = scanner.nextInt();
    System.out.println("Введите радиус круга:");
    int radius = scanner.nextInt();

    int[] anyPoint = new int[2];
    System.out.println("Введите координату X искомой точки:");
    anyPoint[0] = scanner.nextInt();
    System.out.println("Введите координату Y искомой точки:");
    anyPoint[1] = scanner.nextInt();


    if ((anyPoint[0] > center[0] - radius && anyPoint[0] < center[0] + radius) &&
        (anyPoint[1] > center[1] - radius && anyPoint[1] < center[1] + radius)) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}
