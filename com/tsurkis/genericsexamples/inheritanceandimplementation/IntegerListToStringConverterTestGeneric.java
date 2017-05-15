package com.tsurkis.genericsexamples.inheritanceandimplementation;

import java.util.ArrayList;

/**
 * A class to test conversion between integer and string and vice versa.
 * 
 * @author T.Surkis
 *
 */
public class IntegerListToStringConverterTestGeneric extends GeneralConverterTest<ArrayList<Integer>, String, IntegerListToStringConverter> {
  /**
   * Tests if the origin equals to the value of conversion to String and back.
   * 
   * @param entityValue
   * @param converter
   */
  //
  // requires JUnit 4
  //@Test
  public void testIntegerListToString() {
	  IntegerListToStringConverter converter = new IntegerListToStringConverter();
	  
	  ArrayList<Integer> integerList = new ArrayList<>();
	  integerList.add(1);
	  integerList.add(79);
	  integerList.add(32);
	  
	  testEntityConversion(integerList, converter);
  }
  
  /**
   * Tests if the origin equals to the value of conversion to ArrayList Integer and back.
   * 
   * @param databaseValue
   * @param converter
   */
  //
  // requires JUnit 4
  //@Test
  public void testStringToIntegerList() {
	  IntegerListToStringConverter converter = new IntegerListToStringConverter();
	  String databaseValue = new String("1|79|32|2");
	  
	  testDatabaseConversion(databaseValue, converter);
  }
}
