/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */
package net.sf.refactorit.ui.module.encapsulatefield;

import net.sf.refactorit.ui.module.AbstractRefactorItModule;
import net.sf.refactorit.ui.module.ModuleManager;
import net.sf.refactorit.ui.module.RefactorItAction;



public class EncapsulateFieldModule extends AbstractRefactorItModule {

  // Register with ModuleManager
  static {
    ModuleManager.registerModule(new EncapsulateFieldModule());
  }

  private EncapsulateFieldModule() {
  }

  public RefactorItAction[] getActions() {
    return action;
  }


  public String getName() {
    return "Encapsulate Field";
  }

  private static final net.sf.refactorit.ui.module.RefactorItAction[] action
      = {new EncapsulateFieldAction()};
}
