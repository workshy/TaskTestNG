package testClass;

import base.TestBase;
import model.Calculator;
import org.apache.poi.hssf.record.chart.NumberFormatIndexRecord;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dataProvider.DataProviderClass;

/**
 * Created by 12vm2 on 29.10.2016.
 */
public class TestOfArithmeticMethodsForTypeLong extends TestBase {
    @Test( dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "smoke")
    public void testSumLongPositive(long a, long b, long expected){
        assertEquals(calculator.sum(a, b), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, groups = "smoke")
    public void testSubLongPositive(long a, long b, long expected){
        assertEquals(calculator.sub(a, b), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testMultLongPositive(long a, long b, long expected){
        assertEquals(calculator.mult(a, b), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class)
    public void testDivLongPositive(long a, long b, long expected){
        assertEquals(calculator.div(a, b), expected);
    }

    @Test(dataProvider = "getDataProvider", dataProviderClass = DataProviderClass.class, expectedExceptions = NumberFormatException.class, groups = "exception")
    public void testDivLongZero(long a, long b, long expected){
        assertEquals(calculator.div(a, b), expected);
    }
}

