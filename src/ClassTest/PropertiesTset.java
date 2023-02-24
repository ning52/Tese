package ClassTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTset {

    public static void main(String[] args) throws IOException {
        PropertiesTset op=new PropertiesTset();
        op.ClassLoader();
    }
public void ClassLoader() throws IOException {
    Properties pros=new Properties();
    ClassLoader classLoader = PropertiesTset.class.getClassLoader();
    InputStream input=classLoader.getResourceAsStream("JDBC.properties");
    pros.load(input);

    String use = pros.getProperty("use");
    String password = pros.getProperty("password");
    System.out.println(use+password);
     }
}
