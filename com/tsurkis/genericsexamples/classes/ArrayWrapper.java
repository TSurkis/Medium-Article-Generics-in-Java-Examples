package com.tsurkis.genericsexamples.classes;

/**
 * Example of class using a generic method.
 * 
 * @author T.Surkis
 *
 */
public class ArrayWrapper<ArrayType> {
	private ArrayType [] array;
	
	/**
	 * Generic Array print method.
	 * @param array
	 */
	public void print() {
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
	 * The passed in array and the member class array are assumed to be in the same
	 * length and not null.
	 * @param arrayOne
	 * @param arrayTwo
	 */
	public <ArrayTypeTwo> void print(ArrayTypeTwo [] arrayTwo) {
		StringBuilder arrayPrintString = new StringBuilder("ArrayTypeOne | ArrayTypeTwo\n");
		for (int index = 0; index < array.length; index++) {
			arrayPrintString
				.append(array[index])
				.append(" | ")
				.append(arrayTwo[index])
				.append("\n");
		}
		System.out.println(arrayPrintString);
	}
	
	/**
	 * General constructor.
	 */
	public ArrayWrapper() {
	}
	
	/**
	 * Data constructor.
	 * Receives the array.
	 * @param array
	 */
	public ArrayWrapper(ArrayType [] array) {
		this.array = array;
	}
	
	/**
	 * array setter.
	 * 
	 * @param array
	 */
	public void setArray(ArrayType [] array) {
		this.array = array;
	}
}
