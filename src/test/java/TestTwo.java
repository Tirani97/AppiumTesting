import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Test
public class TestTwo {

    AppiumDriver driver;

    public void NativeApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.nexusvision_mobile");
        capabilities.setCapability("appActivity","com.nexusvision_mobile.MainActivity");
        driver = new AppiumDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='recaptcha-anchor']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='recaptcha-verify-button']")).click();

    }
}
