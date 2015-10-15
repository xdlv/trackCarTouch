package com.fyc.park.action;

public class Filter {

	String property;
	String value;
	boolean exactMatch;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isExactMatch() {
		return exactMatch;
	}

	public void setExactMatch(boolean exactMatch) {
		this.exactMatch = exactMatch;
	}
	
	public int getIntValue(){
		return Integer.parseInt(value);
	}

}
