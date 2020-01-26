import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmaonSearchItem {
	static {
		 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe"); // for IDENTIFY WHICH BROWER YOU HAVE USED.
	 }

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver(); // for LAUNCHING A BROWSER
        driver.get("https://www.amazon.in/?ie=UTF8&tag=abkexpt1-21&ascsubtag=_k_Cj0KCQiA9dDwBRC9ARIsABbedBNQfCYDjQC0S1jhIBKCRNlbeIW9iABAQ8iZKl733XdLqXMYW3-uyAkaAnYWEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiA9dDwBRC9ARIsABbedBNQfCYDjQC0S1jhIBKCRNlbeIW9iABAQ8iZKl733XdLqXMYW3-uyAkaAnYWEALw_wcB"); // for LOADING
   	 
      	
		
        WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); //  for locate SEARCH BAR
        search.sendKeys("laptops",Keys.ENTER);
        
        Thread.sleep(2000);
        driver.close();   
	}

}
