import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationPage {

    private final SelenideElement signInButton = $x("//*[@id='buttons']//*[contains(@href,'//accounts.google.com/')]");




    public void userSignIn(){
        signInButton.shouldHave(Condition.enabled).click();
    }

}
