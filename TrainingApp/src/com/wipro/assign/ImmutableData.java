package com.wipro.assign;

public final class ImmutableData {
	
	private final int value;
	
	public ImmutableData(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
}
