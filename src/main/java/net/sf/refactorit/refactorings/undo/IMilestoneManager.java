/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */
package net.sf.refactorit.refactorings.undo;

import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;


/**
 *
 * @author tonis
 */
public interface IMilestoneManager {
  void createMilestone();

  String getMilestoneInfo();

  void redo() throws CannotRedoException;

  void undo() throws CannotUndoException;

  boolean canRedo();

  boolean canUndo();
}
