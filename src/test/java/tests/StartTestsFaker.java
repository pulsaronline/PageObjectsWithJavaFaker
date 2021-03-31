package tests;

import com.codeborne.selenide.Selenide;
import pages.Helper;
import pages.FillTheFormTestFaker;
import org.junit.jupiter.api.Test;

public class StartTestsFaker {
    FillTheFormTestFaker fillTheFormTestFaker;
    Helper helper;

   @Test
   public void PageObjectTestsQueueFaker() {
        helper = new Helper();
        helper.setup();

        fillTheFormTestFaker = new FillTheFormTestFaker();

        fillTheFormTestFaker.fillTestFormFaker();
        Selenide.sleep(6000);
        fillTheFormTestFaker.checkTestDataFaker();
    }
}
