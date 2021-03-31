package tests;

import com.codeborne.selenide.Selenide;
import pages.FillTheFormTest;
import org.junit.jupiter.api.Test;

public class StartTests {
    FillTheFormTest fillTheFormTest;

    @Test
   public void PageObjectTestsQueue() {
       fillTheFormTest = new FillTheFormTest();

        fillTheFormTest.setup();
        fillTheFormTest.fillTestForm();
        Selenide.sleep(6000);
        fillTheFormTest.checkTestData();
    }
}
