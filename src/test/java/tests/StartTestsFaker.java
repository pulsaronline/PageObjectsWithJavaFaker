package tests;

import org.junit.jupiter.api.Test;
import pages.FillTheFormTestFaker;
import pages.Helper;

public class StartTestsFaker {
    FillTheFormTestFaker fillTheFormTestFaker;
    Helper helper;

   @Test
   public void PageObjectTestsQueueFaker() {
        helper = new Helper();
        helper.setup();
        fillTheFormTestFaker = new FillTheFormTestFaker();

        fillTheFormTestFaker.fillTestFormFaker();
        fillTheFormTestFaker.checkTestDataFaker();
    }
}
