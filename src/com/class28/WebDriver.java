package com.class28;

public interface WebDriver {

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

class ChromeDriver implements WebDriver{

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
	
}

class FireFoxDriver implements WebDriver{

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
	
}
