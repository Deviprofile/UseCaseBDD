package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public TestBase() {
	String path=System.getProperty("user.dir")+"//src//test//resources//configFiles//Config.properties";
	prop=new Properties();
	FileInputStream fin;
	try {
		fin=new FileInputStream(path);
		prop.load(fin);
	}catch(FileNotFoundException e ) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}	
}
public static void Initialize() {
	String strBrowser=prop.getProperty("browser");
	if(strBrowser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(strBrowser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
}
}
