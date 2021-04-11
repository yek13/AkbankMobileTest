package Models;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class NearestAkbankModel extends BaseModel {
    public By menuBar = By.id("com.akbank.android.apps.akbank_direkt:id/akbank_header_right_btn_icon");
    public By directions = By.id("com.akbank.android.apps.akbank_direkt:id/map_detail_fragment_btnYolTarifi");
    public By nearestAkbankGoogleMaps = By.xpath("//android.view.View[@content-desc='Google haritası']");
    public By atmList = By.id("com.akbank.android.apps.akbank_direkt:id/maplistrow_image");
    public By mapAtm = By.id("com.akbank.android.apps.akbank_direkt:id/map_atm_selected_wrapper");
    public By mylocation = By.id("com.google.android.apps.maps:id/mylocation_button");


    List<MobileElement> element;

    public void clickMenuBar(){
        clickElement(menuBar);
    }

    public void clickBottomAtm(){
        clickElement(mapAtm);
    }

    public void clickThirdAtm(){
        element = findElements(atmList);
        clickElement(element.get(2));
    }
    public void clickDirections(){
        clickElement(directions);
    }
    public boolean checkGoogleMaps(){
        return isElementVisible(mylocation);
    }
    public boolean checkNearestAkbankGoogleMaps(){
        return isElementVisible(nearestAkbankGoogleMaps);
    }
}
