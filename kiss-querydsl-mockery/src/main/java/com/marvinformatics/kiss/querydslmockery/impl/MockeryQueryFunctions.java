package com.marvinformatics.kiss.querydslmockery.impl;

public class MockeryQueryFunctions {

	public static boolean equals(Object o1, Object o2) {
		if (o1 == o2)
			return true;

		if (o1 == null)
			return false;

		if (o2 == null)
			return false;

		return o1.equals(o2);
	}

}