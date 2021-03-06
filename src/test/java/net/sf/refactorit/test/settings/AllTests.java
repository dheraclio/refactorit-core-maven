/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */
package net.sf.refactorit.test.settings;

import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {
  /** Hidden constructor. */
  private AllTests() {}

  public static Test suite() throws Exception {
    final TestSuite suite = new TestSuite("Settings package tests");
    suite.addTest(CodeStyleTests.suite());
    return suite;
  }
}
