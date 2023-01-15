package com.banking.chatbot;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.util.ISO8601Utils;

import java.text.FieldPosition;
import java.util.Date;


/**
 * Custom date format class that extends {@link ISO8601DateFormat} to serialize milliseconds.
 *
 * @author Viraj Salokhe
 */
public class RFC3339DateFormat extends ISO8601DateFormat {
  private static final long serialVersionUID = 1L;

  /**
   * Formats the given date using the ISO 8601 format, including milliseconds.
   *
   * @param date The date to format.
   * @param toAppendTo The string buffer to append the formatted date to.
   * @param fieldPosition The field position.
   * @return The given string buffer with the formatted date appended to it.
   */
  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    String value = ISO8601Utils.format(date, true);
    toAppendTo.append(value);
    return toAppendTo;
  }
}
