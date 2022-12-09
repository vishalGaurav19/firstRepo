package GenericsUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String fetchDataFromPropertFile(String key) throws IOException {
		FileInputStream fIs = new FileInputStream("./src/test/resources/propertydata.properties");
		Properties property = new Properties();
		property.load(fIs);
		return property.getProperty(key);
	}

}
