package Tests;

import Models.HomeModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class HomeTest {
    HomeModel homeModel=new HomeModel();

    @Step("Check that <key> is seen")
    public void checkWelcomeTitle(String key){
        Assert.assertTrue("Title not correct",homeModel.checkWelcomeTitle(key));

    }

    @Step("Then click EN YAKIN AKBANK")
    public void clickNearestAkbank()  {
        homeModel.clickNearestAkbank();
    }
}
