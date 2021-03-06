/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */

package net.sf.refactorit.refactorings.conflicts;


import net.sf.refactorit.refactorings.conflicts.resolution.ConflictResolution;

import java.util.List;


/**
 *
 * @author vadim
 */
public interface MultipleResolveConflict {

  public void addPossibleResolution(ConflictResolution resolution);

  public List getPossibleResolutions();

}
