package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResult {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(A.class,B.class,C.class);
		

		System.out.println("Run count......"+r.getRunCount());
		System.out.println("Failure count....."+r.getFailureCount());
		System.out.println("Run time....."+r.getRunTime());
		System.out.println("Ignore count...."+r.getIgnoreCount());		
		System.out.println("successfull...."+r.wasSuccessful());

		List<Failure> f = r.getFailures();
        for(Failure x:f) {
        	System.out.println(x);
    		System.out.println(x.getMessage());
    		System.out.println(x.getTestHeader());
    		System.out.println(x.getException());

        }
	}

}
