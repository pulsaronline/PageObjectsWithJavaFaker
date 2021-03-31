package Tests;

import Pages.FillTheFormTest;

public class StartTests {
    FillTheFormTest fillTheFormTest = new FillTheFormTest();

   public void PageObjectTestsQueue() {

        fillTheFormTest.setup();
        fillTheFormTest.fillTestForm();
        fillTheFormTest.checkTestData();
    }
}
