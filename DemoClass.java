package maven.selenium.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DemoClass {
@Test
public void test() throws InterruptedException {
// declaration and instantiation of objects/variables
//System.setProperty("webdriver.gecko.driver","/home/edureka/Downloads/geckodriver");
//WebDriver driver = new FirefoxDriver();
//comment the above 2 lines and uncomment below 2 lines to use Chrome
System.setProperty("webdriver.chrome.driver","C:UsersArvind PhulareDesktopchromedriver.exe");
WebDriver driver = new ChromeDriver();
String baseUrl = "<a href="http://newtours.demoaut.com/">http://newtours.demoaut.com/</a>";
String expectedTitle = "Welcome: Mercury Tours";
String actualTitle = "";
// launch Fire fox and direct it to the Base URL
driver.get(baseUrl);
// get the actual value of the title
actualTitle = driver.getTitle();
Thread.sleep(3000);
/*
* compare the actual title of the page with the expected one and print
* the result as "Passed" or "Failed"
*/
if (actualTitle.contentEquals(expectedTitle)){
System.out.println("Test Passed!");
}
else
{
System.out.println("Test Failed");
}
//close Fire fox
driver.close();
}
}
