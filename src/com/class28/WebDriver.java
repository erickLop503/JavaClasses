package com.class28;

public interface WebDriver extends Executes, TakesShreenshot {

	/*
	 * Create a WebDriver Interface that will have the following unimplemented
	 * behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
	 * Create 2 classes that implements WebDriver interface: ChromeDriver and
	 * FirefoxDriver.
	 */
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
	
}

class ChromeDriver implements Browser, WebDriver, Report {

	@Override
	public void openBrowser() {

		System.out.println("Chrome can open driver");
	}

	@Override
	public void closeBrowser() {

		System.out.println("Chrome can close browser");
	}

	@Override
	public void maximizeWindow() {

		System.out.println("Chrome can maximized the window");
	}

	@Override
	public void findElement() {

		System.out.println("Chrome can find the element");
	}

	@Override
	public void refreshBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takesScreenShot() {
		// TODO Auto-generated method stub
		
	}
	
}

 class FireFoxDriver implements  Browser, WebDriver, Report{

	@Override
	public void openBrowser() {

		System.out.println("Fire fox can open the browser ");
	}

	@Override
	public void closeBrowser() {

		System.out.println("Fire fox can close the browser ");
	}

	@Override
	public void maximizeWindow() {

		System.out.println("Fire fox can maximized the window");
	}

	@Override
	public void findElement() {

		System.out.println("Fire fox can find the elemnet");
	}

	@Override
	public void refreshBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getReport() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takesScreenShot() {
		// TODO Auto-generated method stub
		
	}
	
}
 
 interface Report{
	 
	 void getReport();
 }
 
 interface Browser{
	 void refreshBrowser();
 }
 
 interface Executes {
	    void execute();
	}

 interface TakesShreenshot {
	    String fileExtension = ".png";// by default this is
	    // public static final variable and it MUST to be INITIALIZED

	    void takesScreenShot();

	    // from java 8 we can have defined methods in interface: static or default
	    static void m1() {
	        System.out.println("Static m1 method");
	    }
	    default void m2() {
	        System.out.println("default m2 method");
	    }
	}
