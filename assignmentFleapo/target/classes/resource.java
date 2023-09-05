import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class resource {
	
	
	public void invoke() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://wishbox2.vercel.app/");
		
	}
}
