package IOTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class klllll {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Properties pt=new Properties();
//        FileInputStream fs=new FileInputStream("jdbc002.properties");
        InputStream fs = ClassLoader.getSystemResourceAsStream("jdbc002.properties");
        InputStream fsw = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc002.properties");
        pt.load(fs);
        String property = pt.getProperty("user");
        System.out.println(property);
    }
}
