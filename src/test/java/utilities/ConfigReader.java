package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties properties = new Properties();
	
	public ConfigReader() 
	{
		
		try
		{
			FileInputStream ip = new FileInputStream("./src/test/resources/config.properties");
			properties.load(ip);
		//	System.out.println(properties.getProperty(""));
		}
		
		catch (IOException e) 
		{
		e.printStackTrace();
			
		}	
		
	}
	
		public String get(String key) {
		return properties.getProperty(key);
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
