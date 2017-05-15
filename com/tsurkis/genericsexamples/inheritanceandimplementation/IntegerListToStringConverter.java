package com.tsurkis.genericsexamples.inheritanceandimplementation;

import java.util.ArrayList;

/**
 * Class that converts from String to ArrayList Integer and vice versa.
 * 
 * @author T.Surkis
 *
 */
public class IntegerListToStringConverter implements PropertyConverter<ArrayList<Integer>, String> {
	
  /**
   * Converts a string to a ArrayList of Integer.
   */
  @Override
  public ArrayList<Integer> convertToEntityProperty(String s) {
    ArrayList<Integer> integers = new ArrayList<>();
    if (s != null && !s.isEmpty()) {
      String[] intString = s.split("\\|");
      for (String string : intString) {
        integers.add(Integer.valueOf(string));
      }
    }
    return integers;
  }

  /**
   * Converts an ArrayList of Integer to a String.
   */
  @Override
  public String convertToDatabaseValue(ArrayList<Integer> integers) {
    StringBuilder integersToStringBuilder = new StringBuilder();
    for (Integer integer : integers) {
      integersToStringBuilder
        .append(String.valueOf(integer))
        .append("|");
    }
    return integersToStringBuilder.toString();
  }
}
