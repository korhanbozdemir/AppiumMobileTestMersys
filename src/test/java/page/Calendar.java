package page;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Calendar extends Driver {

    public Calendar() {

        PageFactory.initElements(androidDriver,this);
    }
}
