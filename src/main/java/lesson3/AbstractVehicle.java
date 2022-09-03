package lesson3;

public abstract class AbstractVehicle {

  protected String type;
  private boolean isStarted = false;
  protected boolean isWantToStop = false;

  public abstract void start();

  public abstract void stop();

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
