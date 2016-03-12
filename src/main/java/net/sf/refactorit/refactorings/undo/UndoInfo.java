/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */
package net.sf.refactorit.refactorings.undo;

import javax.swing.Action;


public abstract class UndoInfo {
  private boolean completed = false;

  public abstract void doUndo() throws Exception;

  public abstract String getDescription();

  public abstract Action getAction();

  public boolean isCompleted() {
    return completed;
  }

  protected void setCompleted(boolean to) {
    completed = to;
  }
}