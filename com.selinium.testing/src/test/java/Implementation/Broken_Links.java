package Implementation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;

public class Broken_Links {
	
	@Then("^check for broken links$")
	public void check_for_broken_links() throws Throwable {
		
		Selinium_Testing.obj= Selinium_Testing.driver.findElements(By.xpath("//*[@href]"));
		
	   System.out.println("Total number of Links in Amazon Home Page is --"+Selinium_Testing.obj.size());
	   
	   for(int i=0; i<Selinium_Testing.obj.size();i++)
	   {
		   WebElement ele=Selinium_Testing.obj.get(i);
		   String url=ele.getAttribute("href");
		   check_the_links(url);
			
	   }
	  
	    
	}
	
	public static void check_the_links(String pass_me_link)
	{
		
		try {
			URL links = new URL(pass_me_link);
			
			HttpURLConnection connection = (HttpURLConnection)links.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();
			if (connection.getResponseCode()==200)
			{
				System.out.println("Link is active "+pass_me_link.toString()+" "+connection.getResponseMessage());
				
				Selinium_Testing.i=Selinium_Testing.i+1;
			}
			if (connection.getResponseCode()==connection.HTTP_NOT_FOUND)
			{
				System.out.println("Link is inactive "+pass_me_link.toString()+" "+connection.getResponseMessage()+" "+connection.getResponseCode());
				
				Selinium_Testing.j=Selinium_Testing.j+1;
			}
			System.out.println("Total Test Cases -"+Selinium_Testing.obj.size()+" passed test case -"+Selinium_Testing.i+" Failed Test case is -"+Selinium_Testing.j);
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	

}
