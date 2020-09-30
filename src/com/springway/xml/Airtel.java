package com.springway.xml;


public class Airtel implements Sim {
	String calling = "Calling from Airtel Mobile";
	String data = "Browsing data from Airtel Mobile";
	
	public String getCalling() {
		return calling;
	}
	
	public void setCalling(String calling) {
		this.calling = calling;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Airtel [calling=" + calling + ", data=" + data + ", getCalling()=" + getCalling() + ", getData()="
				+ getData() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
