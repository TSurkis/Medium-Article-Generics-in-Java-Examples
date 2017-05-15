package com.tsurkis.genericsexamples.inheritanceandimplementation;

import java.util.ArrayList;

/**
 * A class to test conversion between integer and string and vice verasa.
 * 
 * @author T.Surkis
 *
 */
public class IntegerListToStringConverterTestNoGenerics {
  /**
   * Tests if the origin equals to the value of conversion to String and back.
   * 
   * @param entityValue
   * @param converter
   */
  void testSourceToOutputConvert(ArrayList<Integer> entityValue, IntegerListToStringConverter converter) {
  
    String databaseValue = converter.convertToDatabaseValue(entityValue);

    ArrayList<Integer> databaseValueConvertedToEntityValue = converter.convertToEntityProperty(databaseValue);

    //
    // requires JUnit 4
    //assertEquals(entityValue, databaseValueConvertedToEntityValue);
  }

  /**
   * Tests if the origin equals to the value of conversion to ArrayList Integer and back.
   * 
   * @param databaseValue
   * @param converter
   */
  void testOutputToSourceConvert(String databaseValue, IntegerListToStringConverter converter) {
  
    ArrayList<Integer> entityValue = converter.convertToEntityProperty(databaseValue);

    String entityValueConvertedToDatabaseValue = converter.convertToDatabaseValue(entityValue);

    //
    // requires JUnit 4
    //assertEquals(databaseValue, entityValueConvertedToDatabaseValue);
  }
}
