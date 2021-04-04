package tests;

import org.junit.jupiter.api.Test;
import pages.formPage;

public class formTests {
    formPage formPage;
    testData testData;

   @Test
   public void successfulTestsQueue() {
        testData = new testData();
        testBase.setup();
        formPage = new formPage();

        formPage.fillTestForm();
        formPage.checkTestData();
    }
}
