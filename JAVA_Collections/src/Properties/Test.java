package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
	
		//load the properties
		FileInputStream fis = new FileInputStream("abc.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		//read the data from properties file
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
	}

}
