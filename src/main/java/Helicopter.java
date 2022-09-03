public class Helicopter extends AbstractVehicle implements ILighting, IMovable{

  {
    type = "Helicopter";
  }

  private static String model;
  private int height = 0;
  private static final short MAX_HEIGHT = 30;

  Helicopter(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  private static short getMaxHeight() {
    return MAX_HEIGHT;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public void start() {
    setStarted(true);
    System.out.println(type + " is started");
  }

  @Override
  public void stop() {
    if (!isStarted()) {
      System.out.println(type + " " + getModel() + " not in the air");
    } else {
      System.out.println(type + " " + getModel() + " altitude reduction");
      System.out.println(type + " " + getModel() + " landed");
    }
  }

  @Override
  public void turnOnLights() {
    System.out.println("Spotlight on");
  }

  @Override
  public void turnOffLights() {
    System.out.println("Spotlight off");
  }

  @Override
  public void startMove() {
    System.out.println(type + "is gaining altitude");
  }

  public void increaseHeight (int height) {
    if (height > getMaxHeight()) {
      System.out.println("It's impossible, max height is " + getMaxHeight() + " km\n" + getModel() + " will go with " + getMaxHeight() + " km");
      this.height = getMaxHeight();
    } else {
      System.out.println(getModel() + " accelerates to " + height + " km");
      this.height = height;
    }
  }
}
