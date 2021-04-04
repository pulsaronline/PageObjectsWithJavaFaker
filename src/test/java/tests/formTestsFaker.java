package tests;

import org.junit.jupiter.api.Test;
import pages.formPageFaker;

public class formTestsFaker {
    formPageFaker formPageFaker;
    testData testData;

   @Test
   public void successfulTestsQueueFaker() {
        testData = new testData();
        testBase.setup();
        formPageFaker = new formPageFaker();

        formPageFaker.fillTestFormFaker();
        formPageFaker.checkTestDataFaker();
    }
}