package org.sabrina;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Abstract class of tasks executed entirely
 *
 * @author Dmitry Gritskevich
 */
public abstract class EntireEulerTask {

  protected abstract void pushNumber(int number);
  protected abstract void printResults();

  protected void execute() {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(reader.readLine());

      while (count-- > 0) {
        int number = Integer.parseInt(reader.readLine());
        pushNumber(number);
      }
      printResults();
    } catch (Exception e) {
      System.err.println("Something went wrong: " + e);
    }
  }
}