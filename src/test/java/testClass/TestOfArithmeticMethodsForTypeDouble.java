package testClass;

import base.TestBase;
import dataProvider.DataProviderClass;
import org.testng.annotations.Test;

/**
 * Created by Viktoriia_Marynchak on 11/1/2016.
 */
public class TestOfArithmeticMethodsForTypeDouble extends TestBase {
    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "smoke")
    public void testSumDoublePositive(double a, double b, double expected){
        assertEquals(calculator.sum(a, b), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "smoke")
    public void testSubDoublePositive(double a, double b, double expected){
        assertEquals(expected, calculator.sub(a, b));
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testMultDoublePositive(double a, double b, double expected){
        assertEquals(calculator.mult(a, b), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testDivDoublePositive(double a, double b, double expected){
        assertEquals(calculator.div(a, b), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, expectedExceptions = NumberFormatException.class, groups = "exception")
    public void testDivDoubleZero(double a, double b, double expected){
        assertEquals(calculator.div(a, b), expected);
    }
}
