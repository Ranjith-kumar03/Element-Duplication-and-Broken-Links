package Implementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Selinium_Testing {
	
	static  WebDriver driver;
	static  List<WebElement> obj;
	public  WebElement element;
	static int i=0;
	static int j=0;
	@Given("^Kndly open the sites \"([^\"]*)\"$")
	public void kndly_open_the_sites(String website) throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(website);
		driver.manage().window().maximize();
	}
	


	@Then("^close the webdriver$")
	public void close_the_webdriver() throws Throwable {
	    driver.quit();
	}

	@Then("^find elements in page$")
	public void find_elements_in_page() throws Throwable {
		obj=driver.findElements(By.xpath("//input[@type='submit']"));

		System.out.println("Number ofelements is--"+obj.size());

		for(int k=0;k<obj.size();k++)
		{
			int x=obj.get(k).getLocation().getX();
			int y=obj.get(k).getLocation().getY();
			System.out.println("object "+k+" location is X "+x+" location is Y "+y);
			
			if(x!=0)
			{
				element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				element.sendKeys("happy jugs");
				obj.get(k).click();
				Thread.sleep(1000);
				break;
			}
			
			
			
		}
	}
	
			
		
}




	

	

	
		

