package tests;

import org.junit.jupiter.api.Test;
import pages.StudentRegistrationFormPageFaker;

public class StudentRegistrationFormTestsFaker {
    StudentRegistrationFormPageFaker formPageFaker;
    TestData testData;

   @Test
   public void successfulTestsQueueFaker() {
        testData = new TestData();
        TestBase.setup();
        formPageFaker = new StudentRegistrationFormPageFaker();

        formPageFaker.fillTestFormFaker();
        formPageFaker.checkTestDataFaker();
    }
}