package Company_IW;

public class Naveen_Interview {

	public static void main(String[] args) {
		Suppose we have 5000 test cases for a project in which 2000 test cases need to be disabled. So, modifying TestNG attribute - "disabled(true)" is not practicable for each testcases among the huge number test cases. What would be the solution in this context? 
				My answer was, group the test cases module wises or any other approaches and create suits accordingly. But Interviewer’s expectation was different. Is there any other particular method / procedure to handle this situation?
				Suggestion please...
				***********
				Hi, I want to know answers for the below question that i was asked in an interview..
				1) why dont we use java application to run the tests instead of using TestNG?
				2) what challenges did you face in your project and how did you handle it?
					a.Initially I had to write manual testcases and to segregate test case for automation was a challenge in itself coz the application was huge and 
					I was new to the project. Then, gradually I understood the application behaviour and I overcame that. 
					b. To identify elements by name and Id was easy but I was not able to locate all the elements using these properties. Then,I incorporated customised XPATH in my scripts and I could easily locate elements on a webpage. This was also challenging for me but now I am comfortable and confident dealing with this.
					c. To design your automation framework is a big challenge. I observed the integration between modules. How many pages are there in the app,what are the webelements and methods are available per page. I started designing my pages one by one,started designing scripts using java one by one and designed test data,utilities, Properties etc and eventually my framework was fully developed,designed and we'll organised. That is how I overcame this challenge too.
				3) what if your lead is on vacation or is sick.. how will you handle the project if you are the only resource and
				   there is a deadline that is to be met?
				4) what kind of problems do we face while doing Cross Browser Testing and how do we handle it?
				5) Benefits of TestNG?--Better to explain the all annotations & after that grouping,priority,etc
				6) How do you choose a framework?
					Depending upon the application,we will design the framework. 
					Some times client will specify the freamwork and some times based on the project requirement we will implement the freamwork
					Share the user stories to multiple teams to complete with in time which is specified by client
				7) What do you use for maintaining the test data, what if someone adds more column in the excel sheet. How do you handle it..?
					Make sure column names string has to be added in test cases paramters as well. Coulmn count and test case params count should be same.
				8) Can anyone explain where we use the OOPs concepts in Selenium Framework with an example 
					1. Abstract class
					2. Abstraction 
					3. Interface
					4. Method Overloading and Overriding
					5. Polymorphism
					6. Encapsulation
					7. Final, Finalize and Finally
					8. This
				9) What is triage meeting?
				It's a kind of meeting where QA, Dev, BA and leads will discuss all the bugs logged on a weekly/daily basis and take appropriate actions on the bugs...
				They can change the priority,severity and also an ETA is given to the bug for resolution..
				Suppose test team has loved 10 defects. Ba and Dev team decide which one to fix first interms business perspective.
				Deciding the seviarity and priority of fix rate
				It's all about discussion of defects analysis
				And fix rate
				Here main intention is to analyse defects seniority and priorities the fix for the logged defects and allocation of defects to different individuals of Dev team
				In one word general discussion on project related activities but triage is only for defect analysis
				10) Can you tell me in you project where you implemented  method overloading and method over ridding
					Login and search are real time
				Interview question
				We have 40 user stories how do you select from those which one implement first
				11) What if the element is not readily available on the Page?
					You can provide some explicit wait on that particular element. Wait till element is visible or present something like that.
				12) Can interface be overloaded and overridden? Can abstract methods be overridden or overloaded?
				13) Can anyone please tell me whether we can overload and override abstract method and interface method?
					No interface can't be overloaded. We should override the abstract methods of interface coz we need to provide implementation to those methods in the subclass
				14)	What are all the contents of a Test plan?
					Project name,Sprint#,timelines ,Req/featured to be tested ,Out if scope requirements ,Environment details,staffing details,assumptions/dependencies & approvers
				15) Difference between @Parameters and @DataProvider
					@dataprovider is used to fetch the data form external source like excel,text files.
					@parameters is used to pass data throw .xml file
					Guys, it's very simple concept. Never use testng.xml params for test data point of view. It's only used for environment vars like url, build number, env name, browser name etc. Data providers are specially used for test case paramterization, 
					fetching data from external sources like csv, excel, json or XML. Same test case will be used for different set of test data.
				16) How to know the downloaded file name and type ?
				17) What kind of sever used in your project?
					Three types of servers: webserver, app server, DB server. Other than this, we have kafka messaging servers, proxy servers, Jenkins server, logging servers like grefana, kebana etc. Cache servers, integration servers.
				18) How an automation test engineer uses Jenkins tool? What are the things he will perform generally in Jenkins tool?
					Scheduled builds , Build deployment , Email notification  & automation test executions, publish report without manual intervention
				19) How to get total search result counts in google using selenium?
				20) three buttons in a page how to select second with out using index and list also iteration---(//button[@name ='' ])[position() =2] or use last() - 1
				21) What is the difference between testing report and extent report?
					Why we are using extent report why can't test ng?
					Testng will not provide flexibility to do bellow mentioned points 
				Can't add snapshot for failed or passed cases 
				We cant customise the report to get user defined graphs 
				Trend setting if execution is not possible 
				But all the activities mentioned above are possible in extent report plugin
				22) What is Thread Safe?
				Multiple threads accessing single resource at the same time which will not affect the basic functionality is know has thread safe
				23) How to overcome stale element reference exception?
				Could be 2 reasons The element has been deleted entirely and The element is no longer attached to the DOM.to over come this 
				Sometimes it takes the time to attach element on Dom so you can retry using for loop and try catch.
				for(int i=0i<=2;i++)
				{
				  try{
				 Driver.findElement(By.id()).click();
				 break;
				}
				catch(Exception e)
				{
				Sysout(e.getMessage());
				}
				}
				24) In u r framework where u have used this concepts abstraction 
					Overloading overriding inhertance
					Encapsulation
					Abstraction-base class
					Overloading i gave waits
					Overriding i gave get nd navigate
					Encapsulation all the methods
					Let me exact answers ?
				25) Which is good practise eaither using implicit wait or explicit wait in the script? Its basic question but leads to lot of confusion when use both?
					In my opinion-> Explicit wait is better because it will target condition on specific element..
					Implicit wait works for the whole web page whereas explicit wait works for a specific element. 
					Implicit wait tells the webDriver to wait for specific time period before it throws no such element exception.
					Or it depends on your requirement where you want to load all web-objects in a specified time.
					
					If implicit fails upon not finding element it gives NosuchElement exception but if Explicit wait wait fails it will give 2 exception 
					1.NosuchElement exception
					2.TimeoutException
					You can try both thing by giving invalid Xpath of an element
					Also implicit wait immediately checks if the element is present ..if it element not present it will wait for given time and then again checks for the element ...
					But in Explicit wait it checks for the element on every 500 milliseconds interval, if it finds element it will perform the action if not it will again go and chk after 500 milliseconds till the the timelimit we have provided...
				26) Write a generic program which works for all the webpages in your website that iterate into each and every frame of your webpage and print the corresponding title in it from top to bottom in the order of appearance only
					int counter = 0;
					while(i=1){
					try{
					driver.switchTo().frame(counter);
					counter++;
					}
					catch(Exception e){
					break;
					}
					for(int i = 0;i<=ccounter;i++){}
				27) question - how many ways  in selenium to take screenshots
				question - how to take screen shot of particular element
				Inspect the element you wish to capture,then
				Open the Command Menu with Ctrl + Shift + P, then
				Type in "node screenshot" within the Command Menu, then select capture node screenshot.
				By this way Screenshot will be captured for that specific element...
				http://chercher.tech/java/take-screenshot-selenium-webdriver#element
				question - how to find xpath in latest firefox version
				how to generate report in jenkins?
				what is robot class , firefox profile class
				please suggest me how to prepair these questions
				28) What is the difference between "DesiredCapabilities", "ChromeOptions" and "FirefoxOptions", why and when to use? Can someone please explain? 
					public class ChromeOptions 
					extends MutableCapabilities
					ChromeOptions class to manage options specific to ChromeDriver.

					Usage
					ChromeOptions options = new ChromeOptions()
					options.addExtensions(new File("/path/to/extension.crx"))
					options.setBinary(new File("/path/to/chrome"));

					// For use with ChromeDriver:
					ChromeDriver driver = new ChromeDriver(options);

					// For use with RemoteWebDriver:
					RemoteWebDriver driver = new RemoteWebDriver(
				     new URL("http://localhost:4444/wd/hub"),
				     new ChromeOptions());
				—-------------
					public class FirefoxOptions
					extends MutableCapabilities
					Manage firefox specific settings in a way that geckodriver can understand.

				    FirefoxOptions options = new FirefoxOptions()
				      .addPreference("browser.startup.page", 1)
				      .addPreference("browser.startup.homepage", "https://www.google.co.uk");
				    WebDriver driver = new FirefoxDriver(options);

				—---------------- 
					The desired capability is a series of key/value pairs that stores the browser properties like browsername, browser version, the path of the browser driver in the system, etc. to determine the behaviour of the browser at run time.

					Desired Capabilities are more useful in cases like:
					In mobile application automation, where the browser properties and the device properties can be set.
					In Selenium grid when we want to run the test cases on a different browser with different operating systems and versions. 

					public class DesiredCapabilities
					extends MutableCapabilities 

					DesiredCapabilities capability = DesiredCapabilities.firefox();
					capability.setBrowserName("firefox");
					capability.setPlatform(Platform.WIN8_1);

					Earlier remoteWebDriver was used along wit Desired capabilities object to set browser, verson, platform etc for script we want to run . 
					But now selenium V.3.6 onwards Options() class is being used. Both chromeOptions and FirefoxOptions  extends the class Mutable capabilities. 
					Implemented interfaces are capabilities and java.io.serializable.  
					To set the chromedriver specific capabilities we need to create an object of ChromeOptions and pass the object to webdriver/RemoteWebdriver.  
					Still if we use desired capabilities then it needs tobe merged with ChromeOptions. options.merge(capabilities). 
						and to launch browser with some predefined settings then use firefox profile class and set that with FirefoxOptions.
				29) Diff between abstract and interface
					Explain the framework 
					How to run a particular test case using testng
					Difff annotations in testng
					Why do we use data provider
					What is the use of hashmap 
					Diff between list and set
					Code for screenshot
					How to type a text in the text box
					How to remove the existing text
					Actually they asked me to explain hashmap and abstract class question using code and that’s Naveen video helped me a lot
				30) In our project we have 1000 TC's... But I need to execute some testcases like 20,50,256,543,800? How to execute them?
				31) How do u achieve parallel testing?
					Parallel testing means running your test cases in parallel mode on multiple machines with the combination of different browsers and platforms. 
					Run ur test cases on different nodes so that you can save ur execution time.
				32) Can we automate compatibility testing?
					Now it can be same browsers on different machines or different browsers on multiple machines
					testing an application for different configurations of software / hardware is nothing but compatibility testing. 
					Using selenium you can achieve partial compatibility testing. 
					But as selenium is funtional tool and compatibility testing is non functional type of testing selenium definition wont cover for compatibility but still you can achieve
				33) testing an application for different configurations of software / hardware is nothing but compatibility testing. 
				    Using selenium you can achieve partial compatibility testing. But as selenium is funtional tool and compatibility testing is non functional type of testing selenium definition wont cover for compatibility but still you can achieve
					@Test (invocation count =100)
				34) How to switch from one tab to another tab
					   String parent =driver.getWindowHandle();
				       System.out.println("Parent window id is "+parent);
				       Set<String> allwindows=driver.getWindowHandles();
				       int count =allwindows.size();
				       System.out.println("Total windows="+count);
				       for(String child:allwindows)
				       {
				        if(!parent.equalsIgnoreCase(child))
				        {
				         driver.switchTo().window(child);
						//perform operations
						driver.close();// close the current tab
				        }
				       }
				35) Reason why css selector execution is faster then xpath?
					In css selector we will follow parent -child  relation to create CSS selector.
					Where as xpath we will follow parent to child ,child to parent relation
				36) What are Exception?
					Exception is nothing but un expected situations.  run time errors are often referred as exceptions. . Using try catch block we can handle exceptions.
				37) Suppose you have 5 team members and have only 1 day to complete the testing. Testing is blocked due to 1 severe defect and cannot be resolved within 1 day. How will you complete testing in such situation? What decision will you take as a test lead? 
					And the condition is you have to complete the testing by hook or by crook. You won't be given extra resources and no extra time.
					
					Since this blocker so i will escalate the issue to the higher level and help the stakeholders understand the severity of this issue mentioning if issue is not resolved within then testing team wont be able to complete the testing in given time frame.
					Also, will analyze the remaining testing to be completed and prioritize the testing so that when blocker is resolved then we should start with higher priority items first.
					Probably if time is less we can involve development BA and other support staff to help in testing.
				38) Difference between selenium standardalone jar file and selenium-java jar file?  Can anyone tell me this answer?
					Selenium standalone server contains everything to run scripts on local machine or remote machine or Grid.
					It has both server side and client side bindings

					Selenium java jar contains only things which will required to run scripts on local machine
					It has only client side bindings
				39) How to zoomout and zoomin in selenium
					public static void ZoomIn()
				 {
				     ZoomValue += ZoomIncrement;
				     Zoom(ZoomValue);
				 }
				 public static void ZoomOut()
				 {
				     ZoomValue -= ZoomIncrement;
				     Zoom(ZoomValue);
				 }
				 private static void Zoom(int level)
				 {
				     JavascriptExecutor js = (JavascriptExecutor)driver;
				     js.executeScript("document.body.style.zoom='"+level+"%'"); 
				 }
				 40) How to automatically update maven dependencies in the project, each time we don't want to manually change the pom.xml file for latest dependencies?
					


	}

}
