package org.Log4jlog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
	
	private static Logger logger = LogManager.getLogger(Log4j.class);
	
	public static void main(String[] args) {
		System.out.println("\n....Log details.....\n");
		logger.trace("This is trace message");
		logger.info("This is information message");
		logger.error("This is an warning message");
		logger.warn("This is an warning message");
		logger.fatal("This is a fatal message");
		System.out.println("\n.....completed successfully....\n");
		
	}
	

}