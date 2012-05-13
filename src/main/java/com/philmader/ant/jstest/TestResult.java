package com.philmader.ant.jstest;

public class TestResult {
	
	private ResultType result;

	private String message;
	
	public enum ResultType {
		PASS, FAIL, ERROR
	}

	public TestResult(ResultType result, String message) {
		this.result = result;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public ResultType getResult() {
		return result;
	}
}