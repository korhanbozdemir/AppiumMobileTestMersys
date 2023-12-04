package page;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class More extends Driver {


    public More() {

        PageFactory.initElements(androidDriver,this);
    }
}
