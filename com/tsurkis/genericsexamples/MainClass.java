package com.tsurkis.genericsexamples;

import com.tsurkis.genericsexamples.classes.ArrayWrapper;
import com.tsurkis.genericsexamples.methods.MethodExample;

public class MainClass {

	public static void main(String[] args) {
		/*
		 ****************************************************************************
		 
		  Example of methods - Generic vs Regular
		  
		 ****************************************************************************
		 */
		
		MethodExample methodsExample = new MethodExample();
		
		methodsExample.useRegularMethods();
		
		methodsExample.useGenericMethods();
		
		
		/*
		 ****************************************************************************
		 
		 Example of generic classes
		 
		 ****************************************************************************
		 */
		
		Integer [] integerArray = new Integer [] {37, 22, 79, 12, 53};
		String [] stringArray = new String [] {"Hi", "I", "am", "a", "String Array"};
		
		//
		// Explicit way
		//
		
		ArrayWrapper<Integer> arrayWrapperIntegerEx = new ArrayWrapper<>(integerArray);
		arrayWrapperIntegerEx.print();
		
		ArrayWrapper<String> arrayWrapperStringEx = new ArrayWrapper<>(stringArray);
		arrayWrapperStringEx.print();
		
		//
		// Implicit way
		//
	
		ArrayWrapper arrayWrapperIntegerIm = new ArrayWrapper(integerArray);
		arrayWrapperIntegerEx.print();
		
		ArrayWrapper arrayWrapperStringIm = new ArrayWrapper(stringArray);
		arrayWrapperStringEx.print();
		
		ArrayWrapper arrayWrapperWhat = new ArrayWrapper();
		arrayWrapperWhat.setArray(integerArray);
		arrayWrapperWhat.print();
		
		//
		// Generic method inside generic class
		//
		
		arrayWrapperIntegerEx.print(stringArray);
		arrayWrapperStringEx.print(integerArray);
		
		
		/*
		 ****************************************************************************
		 
		 Example of inheritance & Implementation with Generics API are in the
		 com.tsurkis.genericsexamples.inheritanceandimplementation package.
		 
		 ****************************************************************************
		 */
	}

}
