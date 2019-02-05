package org.sabrina.easy;

import org.junit.Test;
import org.sabrina.EulerTest;

import java.io.IOException;

/**
 * JUnit test to check N9_SpecialPythagoreanTriplet class
 *
 * @author Dmitry Gritskevich
 */
public class N9_SpecialPythagoreanTripletTest extends EulerTest {

  @Test
  public void test() throws IOException {
    String[] inputData = new String[] { "2", "12", "4" };
    String[] outputData = new String[] { "60", "-1" };
    execute(inputData, outputData, N9_SpecialPythagoreanTriplet::main);
  }
}