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
		int[] input = {1,1,1,3,4,5,5,6};	
		duplicates = new duplicates_0512();
		duplicates.setInputArray(input);
	}

	@Test
	public void test() {
		int[] output = {1,3,4,5,6};
		duplicates.removeDuplicates();
		int[] actualOutput = duplicates.getOutputArray();
		for(int iter=0; iter < output.length; iter ++) {
			assertEquals(actualOutput[iter],output[iter]);
		}
		//assertEquals(duplicates.getOutputArray(),output);
		//fail("Not yet implemented");
	}

}
