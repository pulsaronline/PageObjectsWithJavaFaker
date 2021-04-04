package tests;

import org.junit.jupiter.api.Test;
import pages.StudentRegistrationFormPage;

public class StudentRegistrationFormTests {
    StudentRegistrationFormPage StudentRegistrationFormPage;
    TestData testData;

   @Test
   public void successfulTestsQueue() {
        testData = new TestData();
        TestBase.setup();
        StudentRegistrationFormPage = new StudentRegistrationFormPage();

        StudentRegistrationFormPage.fillTestForm();
        StudentRegistrationFormPage.checkTestData();
    }
}
