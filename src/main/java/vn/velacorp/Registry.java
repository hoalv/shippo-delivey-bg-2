package vn.velacorp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Registry {
    private static Properties prop;

    public static Properties getProperties() {
        if (null == prop) {
            prop = new Properties();
        }
        return prop;
    }

    public static Properties loadConfig() throws IOException {
        Properties prop = Registry.getProperties();
        String configPath = new File(".").getCanonicalPath() + "/conf/config.properties";
        prop.load(new FileReader(configPath));
        return prop;
    }
}
