package dataProvider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;



/**
 * Created by 12vm2 on 29.10.2016.
 */
public class DataProviderClass {
    @DataProvider(parallel = true, name = "getDataProvider")
    public static Object[][] getData(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();

        return readerXLS.parse(nameSheet);
    }
}
