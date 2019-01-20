package org.sabrina;

import com.google.common.base.Joiner;
import sun.security.action.GetPropertyAction;

import java.nio.charset.StandardCharsets;
import java.security.AccessController;

public abstract class EulerTest {

  protected String lineSeparator = AccessController.doPrivileged(new GetPropertyAction("line.separator"));

  protected byte[] toByteArray(String[] data) {
    return Joiner.on(lineSeparator).join(data).getBytes(StandardCharsets.UTF_8);
  }
}