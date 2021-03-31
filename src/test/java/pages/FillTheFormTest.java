package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FillTheFormTest {

     String firstName = "Leo",
            lastName = "White",
            gender = "Male",
            email = "pulsar@hotmail.com",
            phoneNumber = "9253339898",
            month = "4",
            year = "1977",
            day = "10",
            subject1 = "Computer Science",
            subject2 = "Math",
            hobbie1 = "Sports",
            hobbie2 = "Music",
            filename = "1.png",
            address = "LA, Oak str., 13",
            state = "NCR",
            city = "Noida",
            pageHeader = "Thanks for submitting the form";

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