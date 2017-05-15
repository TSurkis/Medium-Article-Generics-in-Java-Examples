package com.tsurkis.genericsexamples.inheritanceandimplementation;

/**
 * Generic class to test any converter that implements 
 * the PropertyConverter<P,D> interface.
 * 
 * @author T.Surkis
 *
 * @param <EntityType>
 * @param <DatabaseType>
 * @param <Converter>
 */
public class GeneralConverterTest<EntityType, DatabaseType, Converter extends PropertyConverter<EntityType, DatabaseType>> {
	
  /**
   * Tests if the conversion of entity value to a database value and back
   * is equal to the origin.
   * 
   * @param entityValue
   * @param converter
   */
  protected void testEntityConversion(EntityType entityValue, Converter converter) {

    DatabaseType databaseValue = converter.convertToDatabaseValue(entityValue);

    EntityType databaseValueConvertedToEntityValue = converter.convertToEntityProperty(databaseValue);

    //
    // requires JUnit 4
    //assertEquals(entityValue, databaseValueConvertedToEntityValue);
  }

  /**
   * Tests if the conversion of database value to an entity value and back
   * is equal to the origin.
   * 
   * @param databaseValue
   * @param converter
   */
  protected void testDatabaseConversion(DatabaseType databaseValue, Converter converter) {

    EntityType entityValue = converter.convertToEntityProperty(databaseValue);

    DatabaseType entityValueConvertedToDatabaseValue = converter.convertToDatabaseValue(entityValue);

    //
    // requires JUnit 4
    //assertEquals(databaseValue, entityValueConvertedToDatabaseValue);
  }
}
