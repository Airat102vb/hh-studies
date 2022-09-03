package lesson5;

@FunctionalInterface
public interface Predictable<N> {

  boolean test(N n);
}
