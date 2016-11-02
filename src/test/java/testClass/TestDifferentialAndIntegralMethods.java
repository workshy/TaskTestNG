package testClass;

import base.TestBase;
import dataProvider.DataProviderClass;
import org.testng.annotations.Test;

/**
 * Created by Viktoriia_Marynchak on 11/1/2016.
 */
public class TestDifferentialAndIntegralMethods extends TestBase {
    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testSqrtPositiveDouble(double a, double expected){
        assertEquals(calculator.sqrt(a), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "exception")
    public void testSqrtNegativeDouble(double a, double expected){
        assertEquals(calculator.sqrt(a), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testPowPositiveDouble(double a, double b, double expected){
        assertEquals(calculator.pow(a, b), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "exception")
    public void testPowNegativeDouble(double a, double b, double expected){
        assertEquals(calculator.pow(a, b), expected);
    }
}
