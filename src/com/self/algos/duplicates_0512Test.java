/**
 * 
 */
package com.self.algos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ddeiveegan
 *
 */
public class duplicates_0512Test {
	
	private duplicates_0512 duplicates;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		duplicates = new duplicates_0512();
	}

	@Test
	public void test1() {
		int[] input = {1,1,1,3,4,5,5,6};
		int[] output = {1,3,4,5,6};
		duplicates.setInputArray(input);
		duplicates.removeDuplicates();
		int[] actualOutput = duplicates.getOutputArray();
		for(int iter=0; iter < output.length; iter ++) {
			assertEquals(actualOutput[iter],output[iter]);
		}
	}
	
	@Test
	public void test2() {
		int[] input = {};
		int[] output = {};
		duplicates.setInputArray(input);
		duplicates.removeDuplicates();
		int[] actualOutput = duplicates.getOutputArray();
		for(int iter=0; iter < output.length; iter ++) {
			assertEquals(actualOutput[iter],output[iter]);
		}
	}
	
	@Test
	public void test3() {
		int[] input = {1,1,1,1,1,1,1};
		int[] output = {1};
		duplicates.setInputArray(input);
		duplicates.removeDuplicates();
		int[] actualOutput = duplicates.getOutputArray();
		for(int iter=0; iter < output.length; iter ++) {
			assertEquals(actualOutput[iter],output[iter]);
		}
	}
	
	@Test
	public void test4() {
		int[] input = {-1,-1,0,1,1,3,2,2,5};
		int[] output = {-1,0,1,2,3,5};
		duplicates.setInputArray(input);
		duplicates.removeDuplicates();
		int[] actualOutput = duplicates.getOutputArray();
		for(int iter=0; iter < output.length; iter ++) {
			assertEquals(actualOutput[iter],output[iter]);
		}
	}

}
