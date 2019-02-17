package org.sabrina.medium;

import org.junit.Test;
import org.sabrina.EulerTest;

import java.io.IOException;

/**
 * JUnit test to check N10_SummationOfPrimes class
 *
 * @author Dmitry Gritskevich
 */
public class N10_SummationOfPrimesTest extends EulerTest {

  @Test
  public void test() throws IOException {
    String[] inputData = new String[] { "2", "5", "10" };
    String[] outputData = new String[] { "10", "17" };
    execute(inputData, outputData, N10_SummationOfPrimes::main);
  }
}