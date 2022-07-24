package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties properties;

    public ReadConfig(){
        File src=new File("./Configurations/config.properties");

        try{
            FileInputStream fileInputStream = new FileInputStream(src);
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (Exception e){
            System.out.println("Exception is"+e.getMessage());
        }
    }

    public String getBrowser(){
        String browser=properties.getProperty("browser");
        return browser;
    }

    public String getApplicationUrl(){
        String url=properties.getProperty("Url");
        return url;
    }

    public String getUserName(){
        String username=properties.getProperty("username");
        return username;
    }

    public String getPassword(){
        String password=properties.getProperty("password");
        return password;
    }
}


