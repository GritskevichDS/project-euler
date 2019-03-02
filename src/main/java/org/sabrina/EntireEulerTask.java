package org.sabrina;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Abstract class of tasks executed entirely
 *
 * @author Dmitry Gritskevich
 */
public abstract class EntireEulerTask {

  protected int[] numbers;

  protected abstract void printResults();

  protected void execute() {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(reader.readLine());
      this.numbers = new int[count];

      for (int i = 0; i < count; i++) {
        int number = Integer.parseInt(reader.readLine());
        pushNumber(i, number);
      }
      printResults();
    } catch (Exception e) {
      System.err.println("Something went wrong: " + e);
    }
  }

  protected void pushNumber(int index, int number) {
    this.numbers[index] = number;
  }
}