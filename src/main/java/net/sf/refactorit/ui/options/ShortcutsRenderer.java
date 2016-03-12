/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */
package net.sf.refactorit.ui.options;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Component;


/**
 *
 *
 * @author Vladislav Vislogubov
 */
class ShortcutsRenderer extends DefaultTableCellRenderer {
  public Component getTableCellRendererComponent(
      JTable table, Object value,
      boolean isSelected, boolean hasFocus,
      int row, int column) {
    super.getTableCellRendererComponent(
        table, value, isSelected, hasFocus, row, column);

    Shortcut sc = (Shortcut) value;

    setText(sc.getDispayableName());

    return this;
  }
}
