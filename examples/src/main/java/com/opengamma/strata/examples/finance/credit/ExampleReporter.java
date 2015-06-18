/*
 * *
 *  * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 *  *
 *  * Please see distribution for license.
 *
 *
 */

package com.opengamma.strata.examples.finance.credit;

import com.opengamma.strata.examples.data.ExampleData;
import com.opengamma.strata.examples.finance.credit.api.Reporter;
import com.opengamma.strata.report.ReportCalculationResults;
import com.opengamma.strata.report.trade.TradeReport;
import com.opengamma.strata.report.trade.TradeReportTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class ExampleReporter implements Reporter {

  private static final Logger logger = LoggerFactory.getLogger(ExampleReporter.class);

  final TradeReportTemplate reportTemplate;

  private ExampleReporter(final String tradeReportTemplatePath) {
    this.reportTemplate = ExampleData.loadTradeReportTemplate(tradeReportTemplatePath);
  }

  @Override
  public String reportAsciiAsString(final ReportCalculationResults reportCalculationResults) {
    final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    reportAscii(reportCalculationResults, buffer);
    return buffer.toString();
  }

  @Override
  public void reportAsciiToScreen(final ReportCalculationResults reportCalculationResults) {
    reportAscii(reportCalculationResults, System.out);
  }

  @Override
  public void reportAsciiToLogger(final ReportCalculationResults reportCalculationResults) {
    logger.info("\n" + reportAsciiAsString(reportCalculationResults));
  }

  @Override
  public void reportAscii(final ReportCalculationResults reportCalculationResults, final OutputStream out) {
    final TradeReport tradeReport = TradeReport.of(reportCalculationResults, reportTemplate);
    tradeReport.writeAsciiTable(out);
  }

  @Override
  public String reportCsvAsString(final ReportCalculationResults reportCalculationResults) {
    final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    reportCsv(reportCalculationResults, buffer);
    return buffer.toString();
  }

  @Override
  public void reportCsvToScreen(final ReportCalculationResults reportCalculationResults) {
    reportCsv(reportCalculationResults, System.out);
  }

  @Override
  public void reportCsvToLogger(final ReportCalculationResults reportCalculationResults) {
    logger.info("\n" + reportCsvAsString(reportCalculationResults));
  }

  @Override
  public void reportCsv(final ReportCalculationResults reportCalculationResults, final OutputStream out) {
    final TradeReport tradeReport = TradeReport.of(reportCalculationResults, reportTemplate);
    tradeReport.writeCsv(out);
  }

  public static Reporter of(final String tradeReportTemplatePath) {
    return new ExampleReporter(tradeReportTemplatePath);
  }
}
