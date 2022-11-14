import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement searchField = $x("//input[@id='search']");
    private final SelenideElement searchButton = $x("//button[@class='style-scope ytd-searchbox']");
    private final static String SEARCH_STRING = "Смотреть сериал Сваты";
    public static String BASE_URL = "https://www.youtube.com/";
    private final SelenideElement ellipsisButton = $x("(//*[@id='button']//*[@class='style-scope yt-icon-button'])[1]");
    private final SelenideElement buttonChangeTheme = $x("//div[contains(text(),'Тема: как на устройстве')]");
    private final SelenideElement buttonThemeDark = $x("//*[@id='endpoint']//*[contains(text(), 'Тёмная')]");
    private final SelenideElement assertButtonThatThemeIsDark = $x("//div[contains(text(),'Тема: тёмная')]");

    public void foundSerials() {
        searchField.shouldBe(Condition.enabled).click();
        searchField.shouldHave(Condition.type("text")).setValue(SEARCH_STRING).pressEnter();

    }

    public void openWebSite(String url) {
        Selenide.open(url);
    }

    public void changeThemeOnDark() {
        ellipsisButton.shouldBe(Condition.enabled).click();
        buttonChangeTheme.shouldHave(Condition.text("Тема: как на устройстве")).shouldHave(Condition.enabled).click();
        buttonThemeDark.shouldHave(Condition.enabled).click();

    }

    public void assertThatThemeIsDark() {
        ellipsisButton.shouldBe(Condition.enabled).click();
        assertButtonThatThemeIsDark.shouldHave(Condition.text("Тема: тёмная"));
    }

}
