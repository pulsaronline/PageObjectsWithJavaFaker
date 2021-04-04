package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static public void setup() {
        Configuration.startMaximized = true;
        open("https://demoqa.com/automation-practice-form");
    }
}
