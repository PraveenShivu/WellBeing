package Module;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFetch {
	@Test
	public void pFetch() throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/generic_data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String id = prop.getProperty("Password");
		System.out.println(id);
	}
}
