package fr.efrei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest{
  public class Authorizertest implements Authorizer{
    boolean auth;

    public Authorizertest(boolean b) {
      this.auth = b;
    }
    public boolean authorize() { 
      return this.auth; 
    }
  }

  @Test

  void should_throw_when_not_authorized() {
    // TODO: trigger the bug in Calculator.divide() by implementing the Authorizer interface   
    Authorizertest auto = new Authorizertest(false);

    Calculator test = new Calculator(auto);
    
    assertThrows(UnauthorizedAccessException.class,() -> test.divide(2,2));
  }
}
