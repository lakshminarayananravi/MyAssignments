package week1.day3;

public class Browser {

	public void launchBrowser() {
		System.out.println("Browser is launched successfully");
	}
	public void loadUrl() {
		System.out.println("Given url is loaded successfully");
	}
	public static void main(String[] args) {
		
		Browser browserOptions=new Browser();
		browserOptions.launchBrowser();
		browserOptions.loadUrl();

	}

}
