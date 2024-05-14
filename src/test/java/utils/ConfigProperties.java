package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
    static Properties properties = new Properties();

    private static void initProperties() {
        String target = System.getProperty("target", "config");
        String path = String.format("src/test/resources/%s.properties", target);

        try (FileReader fileReader = new FileReader(path)) {
            properties.load(fileReader);
          //  fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String parameter) {
        if(properties.toString().equals("{}")) {
            initProperties();
        }
        return properties.getProperty(parameter);
    }
}
