package org.sabrina;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Abstract class of tasks
 *
 * @author Dmitry Gritskevich
 */
public abstract class EulerTask {

  protected abstract String getOutput(int number);

  protected void execute() {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(reader.readLine());

      while (count-- > 0) {
        int number = Integer.parseInt(reader.readLine());
        System.out.println(getOutput(number));
      }
    } catch (Exception e) {
      System.err.println("Something went wrong: " + e);
    }
  }
}