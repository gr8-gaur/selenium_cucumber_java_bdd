package ApplicationPages;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import WebConnector.webconnector;
import static WebConnector.webconnector.driver;
import java.io.IOException;

public class Homepage {
	webconnector wc=new webconnector();

    public void goToHomePage() throws InvalidFormatException, IOException, InterruptedException {
//    	String URL=wc.getSpecificColumnData("./src/test/testdata/data.xlsx","sheet1", "URL");
//        driver.get(URL);
//        Thread.sleep(1000);
//        wc.waitForCondition("PageLoad","",60);
    }

    public void checkBlogLinkDisplay() {
    	try {
			wc.PerformActionOnElement("BlogLink_HomePage","Click","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public void openURL(String url) throws InterruptedException {
    	driver.get(url);
		Thread.sleep(1000);
	}
	public void enterValueInEditBox(String val) throws Exception {
    	wc.PerformActionOnElement("googleSearchBox" ,"Type",val);
		Thread.sleep(1000);
	}
}