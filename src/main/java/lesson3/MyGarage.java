package lesson3;

import java.util.ArrayList;
import java.util.List;

public class MyGarage<T extends AbstractVehicle> {

  private List<T> vehicles = new ArrayList<>();

  public void putVehicle(T vehicle) {
    this.vehicles.add(vehicle);
  }

  public List<T> getVehicles() {
    return vehicles;
  }
}
