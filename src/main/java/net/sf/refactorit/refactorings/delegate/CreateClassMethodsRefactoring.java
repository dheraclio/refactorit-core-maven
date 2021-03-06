/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */
package net.sf.refactorit.refactorings.delegate;


import net.sf.refactorit.classmodel.BinCIType;
import net.sf.refactorit.refactorings.AbstractRefactoring;
import net.sf.refactorit.refactorings.ImportManager;
import net.sf.refactorit.refactorings.Refactoring;
import net.sf.refactorit.refactorings.RefactoringStatus;
import net.sf.refactorit.transformations.TransformationList;
import net.sf.refactorit.transformations.TransformationManager;
import net.sf.refactorit.ui.module.RefactorItContext;

import java.util.Collection;


public abstract class CreateClassMethodsRefactoring extends AbstractRefactoring {
  /** Autogenerated proxy constructor. */
  public CreateClassMethodsRefactoring(
      final String name, final RefactorItContext context
  ) {
    super(name, context);
  }

  /**
   * @see Refactoring#checkPreconditions
   */
  public abstract RefactoringStatus checkPreconditions();

  /**
   * @see Refactoring#checkUserInput
   */
  public abstract RefactoringStatus checkUserInput();

  /**
   * @return
   */
  public abstract Collection getMethodsToCreate();

  protected TransformationManager manager;
  protected ImportManager importManager;

  public TransformationList performChange() {
    TransformationList transList = new TransformationList();
    ImportManager importManager = new ImportManager();

    new MethodCreator(getTarget().getTypeRef(),
        getMethodsToCreate(), transList, importManager).createEdit();

    importManager.createEditors(transList);

    return transList;
  }

  public String getDescription() {
    return super.getDescription();
  }


  public abstract BinCIType getTarget();
}
