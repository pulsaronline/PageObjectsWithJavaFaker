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

    public static String randomFirstName(){
        return faker.name().firstName();
    }

    public static String randomLastName(){
        return faker.name().lastName();
    }

    public static String randomEmail(){
        return faker.bothify("????##@mail.ru");
    }

    public static String randomHobbies() {
        ElementsCollection hobbies = $$("#hobbiesWrapper .custom-checkbox");
        int hobbieNumber = faker.number().numberBetween(0, hobbies.size() - 1);
        String hobbieName = hobbies.get(hobbieNumber).text();
        hobbies.get(hobbieNumber).click();
        return hobbieName;
    }

    public static String randomYear() {
        return String.valueOf(faker.number().numberBetween(1900, 2010));
    }

    public static String randomDay() {
        int day = 0;
        day = faker.number().numberBetween(1, 28);
        return String.valueOf(day);
    }

    public static String randomMonth() {

            int generateMonth = faker.number().numberBetween(1, 12);
            String month = null;
            switch (generateMonth) {
                case 1: month = "January"; break;
                case 2: month = "February"; break;
                case 3: month = "March"; break;
                case 4: month = "April"; break;
                case 5: month = "May"; break;
                case 6: month = "June"; break;
                case 7: month = "July"; break;
                case 8: month = "August"; break;
                case 9: month = "September"; break;
                case 10: month = "October"; break;
                case 11: month = "November"; break;
                case 12: month = "December"; break;
            }
            return month;
        }

    public static String randomGender() {
        int genderNumber = faker.number().numberBetween(1, 3);
        String gender = null;
        switch (genderNumber) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Other";
                break;
        }
        return gender;
    }

    public static String randomPhoneNumber() {
        String phoneNumber;
        phoneNumber = faker.number().digits(10);
        return phoneNumber;
    }

    public static String randomAddress() {
        return faker.address().fullAddress();
    }

    public static String randomSubject() {
        int subjectsNumber = faker.number().numberBetween(1, 3);
        String subject = null;
        switch (subjectsNumber) {
            case 1:
                subject = "Maths";
                break;
            case 2:
                subject = "Social Studies";
                break;
            case 3:
                subject = "Computer Science";
                break;
        }
        return subject;
    }

}
