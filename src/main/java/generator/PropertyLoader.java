package generator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    public String getProperty(String propertyName){
        FileInputStream fis;
        Properties property = new Properties();
        String propertyFromFile = null;

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
            propertyFromFile = property.getProperty(propertyName);
        } catch (IOException e){
            System.err.println("Ошибка файл свойств отсутсвует");
        }
        return propertyFromFile;
    }
}
