import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
							
public class Test1Class {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		
		// open chrome to be our test browser
		ChromeDriver driver = new ChromeDriver();
		// open the website we want to test 
		driver.get("https://www.thesparksfoundationsingapore.org/");
		
		
///////////////////////////////////////////////// 10 Elements Test ///////////////////////////////////////////////////
		
		// Element 1 >> Check the title is the same  or no
		
		if(driver.getTitle().contains("The Sparks Foundation | Home"))
		{
			 System.out.println("Titles Mathced | Test 1 Successful");
		}
		else
		{
			 System.out.println("Test 1 Faild");
		}
			
		
		// Element 2 >> Check the URL is the same  or no
		
		if(driver.getCurrentUrl().contains("https://www.thesparksfoundationsingapore.org/"))
		{
			 System.out.println("URL'S Mathced | Test 2 Successful");
		}
		else
		{
			 System.out.println("Test 2 Faild");
		}	
		
		// Element 3 >> Check the About Us is Exist  or no
		
	
		try{
			driver.findElement(By.linkText("About Us")).isEnabled();
			System.out.println("About Us Exist |Test 3 Successful ");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Test 3 Faild");
		}
		
		// Element 4 >> Check the Policies and Code is Exist  or no
			
		
		try{
			driver.findElement(By.linkText("Policies and Code")).isEnabled();
			System.out.println("Policies and Code Exist |Test 4 Successful ");
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Test 4 Faild");
		}
		
		// Element 5 >> Check the Programs is Exist  or no
		
		
		try{
			driver.findElement(By.linkText("Programs")).isEnabled();
			System.out.println("Programs |Test 5 Successful ");
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Test 5 Faild");
		}
		
		// Element 6 >> Check the LINKS is Exist  or no
		
		
		try{
			driver.findElement(By.linkText("LINKS")).isEnabled();
			System.out.println("LINKS |Test 6 Successful ");
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Test 6 Faild");
		}
		
		// Element 7 >> Check the Join Us is Exist  or no
		
		
		try{
			driver.findElement(By.linkText("Join Us")).isEnabled();
			System.out.println("Join Us |Test 7 Successful ");
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Test 7 Faild");
		}

		// Element 8 >> Check the Contact Us is Exist  or no
		
		
		try{
		driver.findElement(By.linkText("Contact Us")).isEnabled();
		System.out.println("Contact Us Exist |Test 8 Successful ");
		}
	
		catch(NoSuchElementException e)
		{
		System.out.println("Test 8 Faild");
		}
		
		// Element 9 >> Check the GRIP (Internship) is Exist  or no
		
		try {
		driver.findElement(By.linkText("GRIP (Internship)")).isEnabled();	
		System.out.println("GRIP (Internship) Exist |Test 9 Successful ");
		}
	
		catch(NoSuchElementException e)
		{
		System.out.println("Test 9 Faild");
		}
		
		// Element 10 >> Check the Student Scholarship Program is Exist  or no
		
		try {
		driver.findElement(By.linkText("Student Scholarship Program")).isEnabled();
		System.out.println("Student Scholarship Program |Test 10 Successful ");

		}
		catch(NoSuchElementException e){
			System.out.println("Test 10 Faild");
		}

		
///////////////////////////////////////////////// 5 Pages Test ///////////////////////////////////////////////////
		
		// Page 1 >> Check the Know More Page working  or no
			
		try {
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/a")).click();
		 Thread.sleep(4000);
		System.out.println("Know More Page Working |Test 11 Successful ");

		}
		catch(NoSuchElementException e){
			System.out.println("Test 11 Faild");
		}
		
		// Page 2 >> Check the Xaltius Page working  or no
		
		try {
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[1]/ul/li[1]/a")).click();
		 Thread.sleep(4000);
		System.out.println("Xaltius Page Working |Test 12 Successful ");

		}
		catch(NoSuchElementException e){
			System.out.println("Test 12 Faild");
		}
		
		// Page 3 >> Check the Internships at Internshala Page working  or no
		
		try {
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[3]/ul/li/a")).click();
		 Thread.sleep(4000);
		System.out.println("Internships at Internshala Page Working |Test 13 Successful ");

		}
		catch(NoSuchElementException e){
			System.out.println("Test 13 Faild");
		}
		
		// Page 4 >> Check the AINE AI Page working  or no
		
		try {
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[1]/ul/li[2]/a")).click();
		 Thread.sleep(4000);
		System.out.println("AINE AI Page Working |Test 14 Successful ");

		}
		catch(NoSuchElementException e){
			System.out.println("Test 14 Faild");
		}
		
		// Page 5 >> Check the Jobs at Tech in Asia Portal Page working  or no
		
		try {
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/ul/li[3]/a")).click();
		 Thread.sleep(4000);
		System.out.println("Jobs at Tech in Asia Portal Page Working |Test 15 Successful ");

		}
		catch(NoSuchElementException e){
			System.out.println("Test 15 Faild");
		}
			
		
		// Exit The Browser
			driver.quit();
			

	}

}
