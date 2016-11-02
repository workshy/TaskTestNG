package testClass;

import base.TestBase;
import dataProvider.DataProviderClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by 12vm2 on 30.10.2016.
 */
public class TestIsPositiveAndIsNegativeMethods extends TestBase {
    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testIsPositivePositiveLong(long val, boolean expected){
        assertEquals(calculator.isPositive(val), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "exception")
    public void testIsPositiveNegativeLong(long val, boolean expected){
        assertEquals(calculator.isPositive(val), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testIsNegativePositiveLong(long val, boolean expected){
        assertEquals(calculator.isNegative(val), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "exception")
    public void testIsNegativeNegativeLong(long val, boolean expected){
        assertEquals(calculator.isNegative(val), expected);
    }
}
