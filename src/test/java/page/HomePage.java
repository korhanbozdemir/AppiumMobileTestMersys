package page;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage extends Driver {

    public HomePage() {

        PageFactory.initElements(androidDriver,this);
    }
}
