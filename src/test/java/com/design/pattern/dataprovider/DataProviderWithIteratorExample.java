package com.design.pattern.dataprovider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderWithIteratorExample {
    @DataProvider(name = "IteratorTypeReturn")
    public Iterator<Object[]> iteratorDataProvider() {
        List<Object[]> testData = new ArrayList<>();
        testData.add(new Object[]{"John", 43});
        testData.add(new Object[]{"Alice", 33});
        return testData.iterator();
    }

    @Test(dataProvider = "IteratorTypeReturn")
    public void getData(String name, int age) {
        System.out.println("Name is: " + name + ", Age:" + age);


    }
}