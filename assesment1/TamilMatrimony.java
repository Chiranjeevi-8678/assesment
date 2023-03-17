package assesment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		
	        	driver.get("https://www.tamilmatrimony.in/");
		        driver.manage().window().maximize();
	        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        //Select profile Dropdown
                WebElement registered_by = driver.findElement(By.name("REGISTERED_BY"));
                Select selectRegisteredBy = new Select(registered_by);
                selectRegisteredBy.selectByValue("1");
		        driver.findElement(By.id("NAME")).sendKeys("CHIRANJEEEVI.B");
	         	driver.findElement(By.name("GENDER")).click();  
		       
		        //Date of birth day
		        WebElement dayDropDown = driver.findElement(By.name("DOBDAY"));
		        Select selectDay = new Select(dayDropDown);
		        selectDay.selectByValue("7");

		        //Date of birth month
		        WebElement monthDropDown = driver.findElement(By.name("DOBMONTH"));
		        Select selectMonth = new Select(monthDropDown);
		        selectMonth.selectByValue("4");

		        //Date of birth year
		        WebElement yearDropDown = driver.findElement(By.name("DOBYEAR"));
		        Select selectYear = new Select(yearDropDown);
		        selectYear.selectByValue("1997");

		        //Select Religion
		        WebElement religionDropDown = driver.findElement(By.id("RELIGION"));
		        Select selectReligion = new Select(religionDropDown);
		        selectReligion.selectByValue("1");

		        //Select Mother Tongue
		        WebElement motherTongueDropDown = driver.findElement(By.id("MOTHERTONGUE"));
		        Select selectMotherTongue = new Select(motherTongueDropDown);
		        selectMotherTongue.selectByValue("47");

		        //Select Country code
		        WebElement CountryCodeDropDown = driver.findElement(By.id("M_COUNTRYCODE"));
		        Select selectCountryCode = new Select(CountryCodeDropDown);
		        selectCountryCode.selectByValue("98");

		        //select Country
		        WebElement countryDropDown = driver.findElement(By.id("COUNTRY"));
		        Select selectCountry = new Select(countryDropDown);
		        selectCountry.selectByValue("98");

		        //Enter Mobile number
		        driver.findElement(By.id("MOBILENO")).sendKeys("78716874504");
		        //Enter Email ID
		        driver.findElement(By.id("EMAIL")).sendKeys("chiranarun1997@gmail.com");
		        //Enter Password
		        driver.findElement(By.name("PASSWD1")).sendKeys("7871674hjdjbjidsdjndsjkkj");

		        //closing the browser
		        driver.quit();

		
	}

}
