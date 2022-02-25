package lensImplementations;
/**
 * A factory class which instantiates 
 * - an asymmetric lens with source = Int x Int and View = Int
 * - a symmetric lens with M1 = String x String  
 */

import framework.AsymmetricLens;
import framework.SymmetricLens;
import lensImplementations.standard.PersonDataSynchronizer;
import lensImplementations.standard.SummationRestorerPreserveFirst;
import lensImplementations.student.SummationRestorerPreserveSecond;

public class LensFactory {
	public AsymmetricLens<IntegerPair, Integer> createAsymmetricLens(){
		//return new SummationRestorerPreserveFirst();
		 return new SummationRestorerPreserveSecond(); 
	}
	public SymmetricLens<StringPair, StringPair> createSymmetricLens(){
		return new PersonDataSynchronizer();
		// Exercise 1c): Instantiate and return your new class instead of the current returned object
	}
}
