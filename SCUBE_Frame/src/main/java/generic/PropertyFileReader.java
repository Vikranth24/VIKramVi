package generic;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * 
 * @author Vikranth
 *
 */

public class PropertyFileReader  {
	
	public String  getValueProperty(String key) throws Throwable {
		FileInputStream file=new FileInputStream(FrameworkConstants.PROPERTIES_PATH);
		Properties properties=new Properties();
		properties.load(file);
		return properties.getProperty(key);
	}

}
