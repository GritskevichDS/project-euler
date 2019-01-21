package org.sabrina.easy;

import org.junit.Test;
import org.sabrina.EulerTest;

import java.io.*;

/**
 * JUnit test to check N1_MultiplesOf3And5 class
 *
 * @author Dmitry Gritskevich
 */
public class N1_MultiplesOf3And5Test extends EulerTest {

  @Test
  public void test() throws IOException {
    String[] inputData = new String[] { "2", "10", "100" };
    String[] outputData = new String[] { "23", "2318" };
    execute(inputData, outputData, N1_MultiplesOf3And5::main);
  }
}