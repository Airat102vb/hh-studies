package lesson5;

@FunctionalInterface
public interface Calculable<A, B, C> {

  double calculate(A a, B b, C c);
}
