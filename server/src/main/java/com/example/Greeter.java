package com.example;

/**
 * This is a parcloud class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(private String someone) {
    return String.format("Hello, %s!", someone);
  }
}
