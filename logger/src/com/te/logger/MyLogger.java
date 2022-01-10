package com.te.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
   public static final Logger LOGGER =Logger.getLogger(MyLogger.class.getName());
	public static void main(String[] args)throws Exception,IOException {
		//ConsoleHandler consoleHandler = new ConsoleHandExler();
		//consoleHandler.setLevel(Level.SEVERE);
		//LOGGER.addHandler(consoleHandler);
		
	FileHandler fileHandler=new FileHandler("D:\\manju\\log.log");
	MyFormatter myFormatter=new MyFormatter();

	fileHandler.setFormatter(myFormatter);
	
	LOGGER.addHandler(fileHandler);
	
	LOGGER.setLevel(Level.FINE);
		
		LOGGER.finest(" i am from finest");
		LOGGER.finer(" i am from finer");
		LOGGER.fine(" i am from fine");
		LOGGER.config(" i am from config");
		LOGGER.info(" i am from info");
		LOGGER.warning(" i am from warning");
		LOGGER.severe(" i am from severe");
		
		
		

	}

}
