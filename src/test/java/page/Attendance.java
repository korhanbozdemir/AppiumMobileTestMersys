package page;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Attendance extends Driver {

    public Attendance() {
        PageFactory.initElements(androidDriver,this);
    }
}
