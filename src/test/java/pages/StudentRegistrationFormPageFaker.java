package pages;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static tests.TestData.*;

public class StudentRegistrationFormPageFaker {

    //Faker faker = new Faker();
    FakeValuesService fakeValuesSevice = new FakeValuesService(
            new Locale("ru"), new RandomService());

    String firstName = randomFirstName();
    String lastName = randomLastName();
    String gender = randomGender();
    String email = randomEmail();
    String phoneNumber = randomPhoneNumber();
    String month = randomMonth();
    String year = randomYear();
    String day = randomDay();
    String subject = randomSubject();
    String hobbie = randomHobbie();
    String filename = "1.png";
    String address = randomAddress();
    String state = null;
    String city = null;
    String pageHeader = "Thanks for submitting the form";



    public void fillTestFormFaker() {
        //FILL OUT THE FORM
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $(byText(gender)).click();
        $("#userNumber").setValue(phoneNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText(month);     //month
        $(".react-datepicker__year-select").selectOptionByValue(year);              //year
        $(".react-datepicker__month").$(byText(day)).click();                       //day
        $("#subjectsContainer").click();
        $("#subjectsInput").setValue(subject).pressEnter();
        $(byText(hobbie)).click();
        $("#uploadPicture").uploadFromClasspath("img/" + filename);
        $("#currentAddress").setValue(address).pressTab();
        //$("#state").click();
        //$(byText(state)).click();
        //$("#city").click();
        //$(byText(city)).click();
        state = randomState();
        city = randomCity(state);
        $("#submit").pressEnter();
    }

    public void checkTestDataFaker() {
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
                text(month),
                text(year),
                text(subject),
                text(hobbie),
                text(filename),
                text(address),
                text(state),
                text(city));
    }
}