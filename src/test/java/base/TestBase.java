package base;

import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

/**
 * Created by 12vm2 on 29.10.2016.
 */
public class TestBase extends Assert {
    public Calculator calculator;
    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        calculator = new Calculator();
    }
}
