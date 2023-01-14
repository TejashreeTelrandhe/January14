package Interface;

public class Implementation_Class implements WebDriver_Interface1,WebElement_Interface2,Select_Interface3{

	public static void main(String[] args) {
		WebDriver_Interface1 ww1 = new Implementation_Class();
		ww1.get();
		ww1.close();
		ww1.quit();
		ww1.getTitile();
		ww1.getCurrentURL();
		ww1.navigate();
		ww1.maximize();
		ww1.getPosition();
		ww1.getSize();
		ww1.setPosition();
		ww1.setSize();
		System.out.println();
		
		WebElement_Interface2 ww2 = new Implementation_Class();
		ww2.sendKeys();
		ww2.clear();
		ww2.click();
		ww2.getText();
		ww2.isDisplayed();
		ww2.isEnabled();
		ww2.isSelected();
		System.out.println();
		
		Select_Interface3 ww3 = new Implementation_Class();
		ww3.deselectAll();
		ww3.getAllSelectedOption();
		ww3.getfirstSelectedOption();
		ww3.getOption();
		ww3.isMultiple();
		ww3.selectByIndex();
		ww3.selectByValue();
		ww3.selectByVisibleText();
		System.out.println();
		
		Implementation_Class ww4 = new Implementation_Class();
		ww4.get();
		ww4.close();
		ww4.quit();
		ww4.getTitile();
		ww4.getCurrentURL();
		ww4.navigate();
		ww4.maximize();
		ww4.getPosition();
		ww4.getSize();
		ww4.setPosition();
		ww4.setSize();
		ww4.sendKeys();
		ww4.clear();
		ww4.click();
		ww4.getText();
		ww4.isDisplayed();
		ww4.isEnabled();
		ww4.isSelected();
		ww4.deselectAll();
		ww4.getAllSelectedOption();
		ww4.getfirstSelectedOption();
		ww4.getOption();
		ww4.isMultiple();
		ww4.selectByIndex();
		ww4.selectByValue();
		ww4.selectByVisibleText();
	}

	@Override
	public void get() {
    System.out.println("WebDriver get method");		
	}

	@Override
	public void close() {
	 System.out.println("WebDriver close method");	
		
	}

	@Override
	public void quit() {
	System.out.println("WebDriver quit method");			
	}

	@Override
	public void navigate() {
		 System.out.println("WebDriver navigate method");			
	}

	@Override
	public void getTitile() {
		 System.out.println("WebDriver getTitle method");			
	}

	@Override
	public void getCurrentURL() {
		 System.out.println("WebDriver getCurrentURL method");			
	}

	@Override
	public void maximize() {
		 System.out.println("WebDriver maximize method");			
	}

	@Override
	public void getSize() {
	 System.out.println("WebDriver getSize method");			
	}

	@Override
	public void getPosition() {
	 System.out.println("WebDriver getPosition method");			
	}

	@Override
	public void setSize() {
	 System.out.println("WebDriver setSize method");			
	}

	@Override
	public void setPosition() {
	System.out.println("WebDriver setPosition method");			
	}

	@Override
	public void sendKeys() {
	 System.out.println("WebElement sendKeys method");			
	}

	@Override
	public void clear() {
	 System.out.println("WebElement clear method");			
	}

	@Override
	public void click() {
	System.out.println("WebElement click method");				
	}

	@Override
	public void getText() {
	System.out.println("WebElement getText method");			
	}

	@Override
	public void isDisplayed() {
	System.out.println("WebElement isDisplayed method");	
	}

	@Override
	public void isSelected() {
	System.out.println("WebElement isSelected method");	
	}

	@Override
	public void isEnabled() {
   System.out.println("WebElement isEnabled method");	
	
	}

	@Override
	public void selectByIndex() {
    System.out.println("Select class method selectByIndex");		
	}

	@Override
	public void selectByVisibleText() {
	    System.out.println("Select class method selectByVisibleText");		
	}

	@Override
	public void selectByValue() {
	    System.out.println("Select class method selectByValue");		
	}

	@Override
	public void deselectAll() {
	    System.out.println("Select class method deselectAll");		
	}

	@Override
	public void getAllSelectedOption() {
	    System.out.println("Select class method getAllSelectedOption");		
	}

	@Override
	public void getfirstSelectedOption() {
	    System.out.println("Select class method getfirstSelectedOption");		
	}

	@Override
	public void getOption() {
	System.out.println("Select class method getOption");
	}

	@Override
	public void isMultiple() {
	System.out.println("Select class method isMultiple");
	}

}
