package org.example.solutions.strings;

/**
 * You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format. date
 * can be written in its binary representation obtained by converting year, month, and day to their
 * binary representations without any leading zeroes and writing them down in year-month-day
 * format.
 * <p>
 * Return the binary representation of date.
 * <p>
 * Input: date = "2080-02-29" Output: "100000100000-10-11101"
 * <p>
 * Input: date = "1900-01-01" Output: "11101101100-1-1"
 */
public class ConvertDateToBinary {

  public String convertDateToBinary(String date) {
    String[] dateArray = date.split("-");
    String year = dateArray[0];
    String month = dateArray[1];
    String day = dateArray[2];
    String binaryYear = Integer.toBinaryString(Integer.valueOf(year));
    String binaryMonth = Integer.toBinaryString(Integer.valueOf(month));
    String binaryDay = Integer.toBinaryString(Integer.valueOf(day));

    StringBuilder buffer = new StringBuilder(binaryYear);
    return buffer.append('-').append(binaryMonth).append('-').append(binaryDay).toString();
  }


}
