package fr.efrei;

import org.junit.jupiter.api.Test;

public class CalculatorTest implements Authorizer {
  bool authorize() { return true; }
  @Test
  void should_throw_when_not_authorized() {
    // TODO: trigger the bug in Calculator.divide() by implementing the Authorizer interface
    if (divide(2, 2)) {
      System.out.println("Everything works");
    }
  }
}
