package org.sabrina;

import sun.security.action.GetPropertyAction;

import java.security.AccessController;

public abstract class EulerTest {

  protected String lineSeparator = AccessController.doPrivileged(new GetPropertyAction("line.separator"));

}