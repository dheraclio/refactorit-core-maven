/*
 * Copyright 2001-2008 Aqris Software AS. All rights reserved.
 * 
 * This program is dual-licensed under both the Common Development
 * and Distribution License ("CDDL") and the GNU General Public
 * License ("GPL"). You may elect to use one or the other of these
 * licenses.
 */
package net.sf.refactorit.reports;

import net.sf.refactorit.common.util.ResourceUtil;
import net.sf.refactorit.options.GlobalOptions;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import java.io.InputStream;


public class MetricsReportGenerator extends ReportGenerator {

  public MetricsReportGenerator() {
    super();
  }

  protected String getToolTipText() {
    return "Metrics report generation";
  }

  protected XMLExporter createExporter() {
    return new MetricsXMLExporter(GlobalOptions.getEncoding(), null, true);
  }

  protected Source getXslForHtmlReport() {
    InputStream xslFile = ResourceUtil.getXSLResourceAsStream(ReportGenerator.class, "metrics2html");      
    Source source = new StreamSource(xslFile);
    return source;
  }

  protected Source getXslForCsvReport() {
    InputStream xslFile = ResourceUtil.getXSLResourceAsStream(ReportGenerator.class, "metrics2csv");      
    Source source = new StreamSource(xslFile);
    return source;
  }

  protected Source getXslForPlainTextReport() {
    InputStream xslFile = ResourceUtil.getXSLResourceAsStream(ReportGenerator.class, "metrics2text");      
    Source source = new StreamSource(xslFile);
    return source;
  }

}
