package lesson3;

public class Car extends AbstractVehicle implements IMovable, ILighting{

  {
    type = "Car";
  }

  private String model;
  private int speed = 0;
  private static final short MAX_SPEED = 450;
  private boolean isStarted = false;
  private boolean isWantToStop = false;

  Car(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  private static short getMaxSpeed() {
    return MAX_SPEED;
  }

  public int getSpeed() {
    return speed;
  }

  @Override
  public void start() {
    setStarted(true);
    System.out.println(type + " " + getModel() + " is started");
  }

  @Override
  public void stop() {
    if (!isStarted()) {
      System.out.println(type + " " + getModel() + " is already stopped");
    } else {
      System.out.println(type + " " + getModel() + " is stopping");
      System.out.println(type + " " + getModel() + " is stopped");
    }
  }

  @Override
  public void turnOnLights(Object color) {
    System.out.println("Headlights on with " + color);
  }

  @Override
  public void turnOffLights() {
    System.out.println("Headlights off");
  }

  @Override
  public void startMove(Object thing) {
    System.out.println(type + thing);
  }

  public void increaseSpeed (int speed) {
    if (speed > getMaxSpeed()) {
      System.out.println("It's impossible, max speed is " + getMaxSpeed() + " km/h\n" + getModel() + " will go with " + getMaxSpeed() + " km/h");
      this.speed = getMaxSpeed();
    } else {
      System.out.println(getModel() + " accelerates to " + speed + " km/h");
      this.speed = speed;
    }
  }

  protected boolean isStarted() {
    return isStarted;
  }

  protected void setStarted(boolean isStarted) {
    this.isStarted = isStarted;
  }

  public boolean isWantToStop() {
    return this.isWantToStop;
  }

  public void setWantToStop(boolean wantToStop) {
    this.isWantToStop = wantToStop;
  }
}
