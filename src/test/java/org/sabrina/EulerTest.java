package org.sabrina;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import sun.security.action.GetPropertyAction;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.AccessController;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.assertArrayEquals;

public abstract class EulerTest {

  protected String lineSeparator = AccessController.doPrivileged(new GetPropertyAction("line.separator"));

  protected void execute(String[] inputData, String[] outputData, Consumer<String[]> main) throws IOException {
    InputStream sysIn = System.in;
    PrintStream sysOut = System.out;

    try (
        ByteArrayInputStream dataIn = new ByteArrayInputStream(toByteArray(inputData));
        ByteArrayOutputStream dataOut = new ByteArrayOutputStream()) {

      System.setIn(dataIn);
      System.setOut(new PrintStream(dataOut));

      main.accept(new String[] {});

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

  protected byte[] toByteArray(String[] data) {
    return Joiner.on(lineSeparator).join(data).getBytes(StandardCharsets.UTF_8);
  }
}