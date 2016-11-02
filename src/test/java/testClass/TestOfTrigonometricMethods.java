package testClass;

import base.TestBase;
import dataProvider.DataProviderClass;
import org.testng.annotations.Test;

import static java.lang.Double.*;


/**
 * Created by Viktoriia_Marynchak on 10/31/2016.
 */
public class TestOfTrigonometricMethods extends TestBase {
    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testCosPositiveDouble(double a, double expected){
        assertEquals(calculator.cos(a), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testSinPositiveDouble(double a, double expected){
        assertEquals(calculator.sin(a), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testTgPositiveDouble(double a, double expected){
        assertEquals(calculator.tg(a), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testCtgPositiveDouble(double a, double expected){
        assertEquals(calculator.ctg(a), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "exception")
    public void testCtgNegativeDouble(double a, double expected){
        assertEquals(calculator.ctg(a), expected);
    }
}
