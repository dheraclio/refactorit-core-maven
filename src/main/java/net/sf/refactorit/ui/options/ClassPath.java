/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */
package net.sf.refactorit.ui.options;

/** @author Igor Malinin */
public final class ClassPath extends Path {
  public static final ClassPath EMPTY = new ClassPath();

  private ClassPath() {
    super("");
  }

  public ClassPath(String path) {
    super(path);
  }
}
