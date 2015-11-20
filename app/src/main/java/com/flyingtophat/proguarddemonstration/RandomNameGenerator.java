package com.flyingtophat.proguarddemonstration;

import java.util.Random;

public class RandomNameGenerator {

	private final Random random = new Random();
	
	private String[] mFirstNames;
	private String[] mLastNames;
	
	public RandomNameGenerator(String[] firstNames, String[] lastNames) {
		mFirstNames = firstNames;
		mLastNames = lastNames;
	}
	
	public String[] getName() {
		int firstNameIndex = random.nextInt(mFirstNames.length);
		int lastNameIndex  = random.nextInt(mLastNames.length);
		
		return new String[] { mFirstNames[firstNameIndex], mLastNames[lastNameIndex] };
	}
	
	// This method isn't used, so let's see what ProGuard does with it
	public void dummyMethod() {}
} 