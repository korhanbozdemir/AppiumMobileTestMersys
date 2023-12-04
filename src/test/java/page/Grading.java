package page;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Grading extends Driver {

    public Grading() {

        PageFactory.initElements(androidDriver,this);
    }
}
