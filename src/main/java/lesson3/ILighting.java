package lesson3;

public interface ILighting<T> {

  void turnOnLights(T color);

  void turnOffLights();
}
