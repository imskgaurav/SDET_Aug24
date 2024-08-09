package com.sel.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateTestDataSet {


    @DataProvider(name = "create")
    public Object[][] dataSet1() {

        return new Object[][]{

                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"}

        };


    }

    @Test(dataProvider = "create")
    public void test(String userName, String pass) {

        System.out.println(userName + "==="+pass);

    }


}



