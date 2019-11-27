package org.test.maven;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Prallel {
public static void main(String[] args) {
	Result rs = JUnitCore.runClasses(B.class,A.class,C.class);
	int f = rs.getFailureCount();
	System.out.println("Failures"+f);
	int run = rs.getRunCount();
	System.out.println("run count"+run);
	int ignoreCount = rs.getIgnoreCount();
	System.out.println(ignoreCount);
	long runTime = rs.getRunTime();
	System.out.println(runTime);
	List<Failure> failures = rs.getFailures();
	for (Failure f1 : failures) {
		System.out.println(f1);
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
