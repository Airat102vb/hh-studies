package lesson3;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    MyGarage<Car> carGarage = new MyGarage<>();
    carGarage.putVehicle(new Car("BMW"));
    carGarage.putVehicle(new Car("Mercedes"));

    MyGarage<Helicopter> helicopterGarage = new MyGarage<>();
    helicopterGarage.putVehicle(new Helicopter("H-30"));
    helicopterGarage.putVehicle(new Helicopter("H-50"));

    Scanner scanner = new Scanner(System.in);

    for (Car car : carGarage.getVehicles()) {
      car.start();
      car.turnOnLights("green");
      car.startMove(" is moving");
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
    }

    System.out.println();

    for (Helicopter helicopter : helicopterGarage.getVehicles()) {
      helicopter.start();
      helicopter.turnOnLights("white");
      helicopter.startMove(" is moving");
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
      System.out.println();
    }
  }
}
