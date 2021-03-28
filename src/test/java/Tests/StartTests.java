package Tests;

import Pages.FillTheFormTest;
import org.junit.jupiter.api.Test;

public class StartTests {
    FillTheFormTest FillTheFormTest;
    
    @Test
   void PageObjectTestsQueue() {
        //open target page
        FillTheFormTest = new FillTheFormTest();
     
        FillTheFormTest.setup();
        FillTheFormTest.fillTestForm();
        FillTheFormTest.checkTestData();
    }
}
