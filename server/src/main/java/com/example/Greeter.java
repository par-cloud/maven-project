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

  /**
   * @param someone the name of a person
   * @return greeting string
   * @author parcloud
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
