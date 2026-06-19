package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties properties ;
	
	public Properties init_prop()
	{
		properties = new Properties();
		
		try
		{
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			properties.load(ip);
			System.out.println(properties.getProperty("browser"));
			System.out.println(properties.getProperty("url"));
		}
		
		catch (IOException e) 
		{
		e.printStackTrace();
			
		}	
		return properties;
	}
	}
