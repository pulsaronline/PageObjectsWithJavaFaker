package tests;

import com.codeborne.selenide.Selenide;
import pages.Helper;
import pages.FillTheFormTest;
import org.junit.jupiter.api.Test;

public class StartTests {
    FillTheFormTest fillTheFormTest;
    Helper helper;

   @Test
   public void PageObjectTestsQueue() {
        helper = new Helper();
        helper.setup();
        fillTheFormTest = new FillTheFormTest();

        fillTheFormTest.fillTestForm();
        fillTheFormTest.checkTestData();
    }
}
