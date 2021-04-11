package Tests;

import Models.HomeModel;
import Models.NearestAkbankModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class NearestAkbankTest {
    NearestAkbankModel nearestAkbankModel=new NearestAkbankModel();


    @Step("Click menu bar on upper right corner")
    public void clickMenuBar() {
        nearestAkbankModel.clickMenuBar();
    }

    @Step("Click on the third ATM option")
    public void clickThirdAtm() {
        nearestAkbankModel.clickThirdAtm();
    }

    @Step("Click YOL TARIFI")
    public void clickDirections() {
        nearestAkbankModel.clickDirections();
    }
    @Step("Click ATM at the bottom of screen")
    public void clickBottomAtm() {
        nearestAkbankModel.clickBottomAtm();
    }

    @Step("Check Google Maps is opened for directions")
    public void checkGoogleMaps() {
        Assert.assertTrue("Google Maps not opened",nearestAkbankModel.checkGoogleMaps());
    }
    @Step("Check that your location is shown correctly")
    public void checkNearestAkbankGoogleMaps() {
        Assert.assertTrue("Google Maps not opened",nearestAkbankModel.checkNearestAkbankGoogleMaps());
    }
}
