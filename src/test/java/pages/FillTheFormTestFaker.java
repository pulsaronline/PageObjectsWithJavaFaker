package pages;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static pages.FakerHelper.*;

public class FillTheFormTestFaker {

    Faker faker = new Faker();
    FakeValuesService fakeValuesSevice = new FakeValuesService(
            new Locale("ru"), new RandomService());

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String gender = faker.dog().gender();
    String email = faker.bothify("????##@mail.ru");
    String phoneNumber = faker.number().digits(10);
    String month = randomMonth();
    String year = randomYear();
    String day = randomDay();
    String subject1 = "Computer Science";
    String subject2 = "Math";
    String hobbie1 = randomHobbies();
    String hobbie2 = randomHobbies();
    String filename = "1.png";
    String address = faker.address().fullAddress();;
    String state = "NCR";
    String city = "Noida";
    String pageHeader = "Thanks for submitting the form";

    public void setup() {
        Configuration.startMaximized = true;
        open("https://demoqa.com/automation-practice-form");
    }

    public void fillTestForm() {
        //FILL OUT THE FORM
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $(byText(gender)).click();
        $("#userNumber").setValue(phoneNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue(month);    //month
        $(".react-datepicker__year-select").selectOptionByValue(year);      //year
        $(".react-datepicker__month").$(byText(day)).click();               //day
        $("#subjectsContainer").click();
        $("#subjectsInput").setValue(subject1).pressEnter();
        $("#subjectsInput").setValue(subject2).pressEnter();
        $(byText(hobbie1)).click();
        $(byText(hobbie2)).click();
        $("#uploadPicture").uploadFromClasspath("img/" + filename);
        $("#currentAddress").setValue(address).pressTab();
        $("#state").click();
        $(byText(state)).click();
        $("#city").click();
        $(byText(city)).click();
        $("#submit").pressEnter();
    }

    public void checkTestData() {
        //check the header, should be "Thanks for submitting the form"
        $("#example-modal-sizes-title-lg").shouldHave(text(pageHeader));
        //check the form elements
        $(".table-responsive").shouldHave(
                text(firstName),
                text(lastName),
                text(email),
                text(gender),
                text(phoneNumber),
                text(day),
                text("may"),
                text(year),
                text(subject1),
                text(subject2),
                text(hobbie1),
                text(hobbie2),
                text(filename),
                text(address),
                text(state),
                text(city));
    }
}