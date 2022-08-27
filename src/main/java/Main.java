import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Car car = new Car("BMW");
    car.start();
    car.turnOnLights();
    car.startMove();
    while (!car.isWantToStop()) {
      System.out.println("If you want to stop, enter speed 0 (zero)");
      int speed = scanner.nextInt();
      if (speed == 0) {
        car.setWantToStop(true);
        continue;
      }
      car.increaseSpeed(speed);
    }
    car.stop();

    System.out.println();

    Helicopter helicopter = new Helicopter("H-30");
    helicopter.start();
    helicopter.turnOnLights();
    helicopter.startMove();
    while (!helicopter.isWantToStop()) {
      System.out.println("If you want to stop, enter height 0 (zero)");
      int height = scanner.nextInt();
      if (height == 0) {
        helicopter.setWantToStop(true);
        continue;
      }
      helicopter.increaseHeight(height);
    }
    helicopter.stop();
  }
}
