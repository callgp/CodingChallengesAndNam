package com.solution;

import com.nam.Company;

/**
 * @author Crunchify.com
 */
 
public class CrunchifyHideStaticMethod {
	public static void main(String args[]) {
		Company cmp = new CrunchifyCompany();
		// if we can override static, this should call method from Child class
		cmp.staticMethod(); // Eclipse should show warning: The static method
							// staticMethod() from the type Company should be
							// accessed in a static way
		cmp.nonStaticMethod();
	}
}
 
