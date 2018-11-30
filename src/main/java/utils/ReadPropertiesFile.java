package utils;

import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {

    public static Properties prop;
    private static String env = "dev";

    static {
        InputStream is;

        prop = new Properties();
        is = ClassLoader.class.getResourceAsStream("/" + env + ".properties");
        try {
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getPropertyValue(String key) {
        return prop.getProperty(key);
    }
}