package org.sabrina.easy;

import com.google.common.base.Splitter;
import org.junit.Test;
import org.sabrina.EulerTest;

import java.io.*;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

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

    InputStream sysIn = System.in;
    PrintStream sysOut = System.out;

    try (
        ByteArrayInputStream dataIn = new ByteArrayInputStream(toByteArray(inputData));
        ByteArrayOutputStream dataOut = new ByteArrayOutputStream()) {

      System.setIn(dataIn);
      System.setOut(new PrintStream(dataOut));

      N1_MultiplesOf3And5.main(new String[] {});

      List<String> answers = Splitter
          .on(lineSeparator)
          .omitEmptyStrings()
          .splitToList(new String(dataOut.toByteArray()));

      assertArrayEquals(outputData, answers.toArray());
    } finally {
      System.setIn(sysIn);
      System.setOut(sysOut);
    }
  }
}