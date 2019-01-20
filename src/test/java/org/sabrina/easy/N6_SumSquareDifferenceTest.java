package org.sabrina.easy;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.Test;
import org.sabrina.EulerTest;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

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

    InputStream sysIn = System.in;
    PrintStream sysOut = System.out;

    try (
        ByteArrayInputStream dataIn = new ByteArrayInputStream(toByteArray(inputData));
        ByteArrayOutputStream dataOut = new ByteArrayOutputStream()) {

      System.setIn(dataIn);
      System.setOut(new PrintStream(dataOut));

      N6_SumSquareDifference.main(new String[] {});

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

  private byte[] toByteArray(String[] data) {
    return Joiner.on(lineSeparator).join(data).getBytes(StandardCharsets.UTF_8);
  }
}