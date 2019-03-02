package org.sabrina.easy;

import org.junit.Test;
import org.sabrina.EulerTest;

import java.io.IOException;

/**
 * JUnit test to check N7_10001stPrime class
 *
 * @author Dmitry Gritskevich
 */
public class N7_10001stPrimeTest extends EulerTest {

  @Test
  public void test() throws IOException {
    String[] inputData = new String[] { "2", "3", "6" };
    String[] outputData = new String[] { "5", "13" };
    execute(inputData, outputData, N7_10001stPrime::main);
  }
}