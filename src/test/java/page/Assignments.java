package page;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Assignments extends Driver {
    public Assignments() {
        PageFactory.initElements(androidDriver,this);
    }
}
