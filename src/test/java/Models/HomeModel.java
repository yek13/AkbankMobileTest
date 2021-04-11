package Models;

import org.openqa.selenium.By;

public class HomeModel extends BaseModel {

    public By title = By.id("com.akbank.android.apps.akbank_direkt:id/title");
    public By nearestAkbank = By.id("com.akbank.android.apps.akbank_direkt:id/item3");


    public boolean checkWelcomeTitle(String key){
        return getText(title).replace("\n", " ").contains(key);
    }
    public void clickNearestAkbank() {
        clickElement(nearestAkbank);

    }
}
