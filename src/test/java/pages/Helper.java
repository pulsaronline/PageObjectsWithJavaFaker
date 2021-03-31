package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class Helper {

    public static Faker faker = new Faker();

    public void setup() {
        Configuration.startMaximized = true;
        open("https://demoqa.com/automation-practice-form");
    }
    public static String randomHobbies() {
        ElementsCollection hobbies = $$("#hobbiesWrapper .custom-checkbox");
        int hobbieNumber = faker.number().numberBetween(0, hobbies.size() - 1);
        String hobbieName = hobbies.get(hobbieNumber).text();
        hobbies.get(hobbieNumber).click();
        return hobbieName;
    }
    public static String randomYear() {
        return String.valueOf(faker.number().numberBetween(1900, 2099));
    }
    public static String randomDay() {
        int day = 0;
        day = faker.number().numberBetween(1, 28);
        return String.valueOf(day);
    }
    public static String randomMonth() {
        return String.valueOf(faker.number().numberBetween(1, 12));
    }
}
