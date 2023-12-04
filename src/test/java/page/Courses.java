package page;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Courses extends Driver {

    public Courses() {
        PageFactory.initElements(androidDriver,this);
    }
}
