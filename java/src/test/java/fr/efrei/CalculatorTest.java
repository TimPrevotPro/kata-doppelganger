package fr.efrei;

import org.junit.jupiter.api.Test;

public class CalculatorTest{
  public class Authorizertest implements Authorizer{

    public Authorizertest() {
    }
    public boolean authorize() { 
      return false; 
    }
  }

  @Test

  void should_throw_when_not_authorized() {
    // TODO: trigger the bug in Calculator.divide() by implementing the Authorizer interface   
    Authorizertest auto = new Authorizertest();

    Calculator test = new Calculator(auto);
    
  }
}
