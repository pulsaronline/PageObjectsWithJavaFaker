package Tests;

import Pages.FillTheFormTest;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class StartTests {
    FillTheFormTest FillTheFormTest;
    
    @BeforeAll
    public static void setup() {
        //use fullscreen
        Configuration.startMaximized = true;
        
    }

    @Test
   public void PageObjectExample() {
        //open target page
        FillTheFormTest = new FillTheFormTest();
        //open("https://demoqa.com/automation-practice-form");
        open("https://demoqa.com/automation-practice-form");
       
        FillTheFormTest.fillTestForm();
        FillTheFormTest.checkTestData();
    }
}
