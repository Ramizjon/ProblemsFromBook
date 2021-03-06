package com.ramiz;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main( String[] args ){
		
	    	Result result = JUnitCore.runClasses(RotationTest.class);
	    	for (Failure failur: result.getFailures()){
	    		System.out.println(failur);
	    	}
	    	System.out.println("Result was successful: " + result.wasSuccessful());
	    }
}
