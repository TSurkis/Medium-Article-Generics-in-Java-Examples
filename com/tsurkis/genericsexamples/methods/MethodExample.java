package com.tsurkis.genericsexamples.methods;

/**
 * Example class of generic method usage.
 * 
 * @author T.Surkis
 * 
 */
public final class MethodExample {
	
	/**
	 * Example method of usage of regular methods.
	 */
	public void useRegularMethods() {
		int [] integerArray = new int [] {37, 22, 79, 12, 53};
		double [] doubleArray = new double [] {3.14, 1.6180, 2.71828, 0.57721, 1.0};
		
		printArray(integerArray);
		printArray(doubleArray);
	}
	
	/**
	 * Example method of usage of generic methods.
	 */
	public void useGenericMethods() {
		Integer [] integerArray = new Integer [] {37, 22, 79, 12, 53};
		Double [] doubleArray = new Double [] {3.14, 1.6180, 2.71828, 0.57721, 1.0};
		String [] stringArray = new String [] {"Hi", "I", "am", "a", "String Array"};
		
		//
		// Generics single variable explicit way
		this.<Integer>printAnyArray(integerArray);
		this.<Double>printAnyArray(doubleArray);
		this.<String>printAnyArray(stringArray);
		
		//
		// Generics single variable implicit way
		printAnyArray(integerArray);
		printAnyArray(doubleArray);
		printAnyArray(stringArray);

		//
		// Generics two variables explicit way
		this.<Integer,String>printTwoArrays(integerArray, stringArray);
		
		//
		// Generics two variables implicit way
		printTwoArrays(integerArray, stringArray);
	}
	
	/**
	 * int Array print method.
	 * @param array
	 */
	public void printArray(int [] array) {
		StringBuilder arrayPrintString = new StringBuilder("Array: ");
		if (array != null && array.length != 0) {
			for (Integer printObject : array) {
				arrayPrintString
					.append(printObject)
					.append("|");
			}
		} else {
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}
	
	/**
	 * double Array print method.
	 * @param array
	 */
	public void printArray(double [] array) {
		StringBuilder arrayPrintString = new StringBuilder("Array: ");
		if (array != null && array.length != 0) {
			for (Double printObject : array) {
				arrayPrintString
					.append(printObject)
					.append("|");
			}
		} else {
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}
	
	/**
	 * Generic Array print method.
	 * @param array
	 */
	public <ArrayType> void printAnyArray(ArrayType [] array) {
		StringBuilder arrayPrintString = new StringBuilder("Array: ");
		if (array != null && array.length != 0) {
			for (ArrayType printObject : array) {
				arrayPrintString
					.append(printObject)
					.append("|");
			}
		} else {
			arrayPrintString.append("Empty Array");
		}
		System.out.println(arrayPrintString);
	}
	
	/**
	 * Generic Two Array print method.
	 * The passed in arrays are assumed to be in the same
	 * length and not null.
	 * @param arrayOne
	 * @param arrayTwo
	 */
	public <ArrayTypeOne, ArrayTypeTwo> void printTwoArrays(ArrayTypeOne [] arrayOne, ArrayTypeTwo [] arrayTwo) {
		StringBuilder arrayPrintString = new StringBuilder("ArrayTypeOne | ArrayTypeTwo\n");
		for (int index = 0; index < arrayOne.length; index++) {
			arrayPrintString
				.append(arrayOne[index])
				.append(" | ")
				.append(arrayTwo[index])
				.append("\n");
		}
		System.out.println(arrayPrintString);
	}
}
