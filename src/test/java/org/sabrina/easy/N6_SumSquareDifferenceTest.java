package org.sabrina.easy;

import org.junit.Test;
import org.sabrina.EulerTest;

import java.io.*;

/**
 * JUnit test to check N6_SumSquareDifference class
 *
 * @author Dmitry Gritskevich
 */
public class N6_SumSquareDifferenceTest extends EulerTest {

  @Test
  public void test() throws IOException {
    String[] inputData = new String[] { "2", "3", "10" };
    String[] outputData = new String[] { "22", "2640" };
    execute(inputData, outputData, N6_SumSquareDifference::main);
  }
}