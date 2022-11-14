import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationPage {

    private final SelenideElement signInButton = $x("//*[@id='buttons']//*[contains(@href,'//accounts.google.com/')]");
    private final SelenideElement fieldEmail = $x("//input[@type='email']");
    private static final String LOGIN = "nick.pe3ch@gmail.com";
    private final SelenideElement buttonFurther = $x("//span[contains(text(), 'Далее')]");
    private final SelenideElement fieldPassword = $x("//input[@type='text']");
    private static final String PASSWORD = "nickpe3ch";



    public void userSignIn() {
        signInButton.shouldHave(Condition.enabled).click();
        fieldEmail.shouldHave(Condition.enabled).sendKeys(LOGIN);
        buttonFurther.shouldBe(Condition.text("Далее")).shouldHave(Condition.enabled).click();
        fieldPassword.shouldBe(Condition.text("Введите пароль")).setValue(PASSWORD);
        buttonFurther.shouldBe(Condition.text("Далее")).shouldHave(Condition.enabled).click();

    }
}
