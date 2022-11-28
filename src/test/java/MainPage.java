import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement searchField = $x("//input[@id='search']");
    private final SelenideElement youTubeLogo = $x("(//a[@title='Главная страница YouTube'])[1]");
    private final static String SEARCH_STRING = "Смотреть сериал Сваты";
    public static String BASE_URL = "https://www.youtube.com/";
    private final SelenideElement ellipsisButton = $x("(//*[@id='button']//*[@class='style-scope yt-icon-button'])[1]");
    private final SelenideElement buttonChangeTheme = $x("//div[contains(text(),'Тема: как на устройстве')]");
    private final SelenideElement buttonThemeDark = $x("//*[@id='endpoint']//*[contains(text(), 'Тёмная')]");
    private final SelenideElement assertButtonThatThemeIsDark = $x("//div[contains(text(),'Тема: тёмная')]");
    private final SelenideElement buttonBurgerMenu = $x("//button[@id='button' and @aria-label='Гид']");
    private final SelenideElement buttonMain = $x("//a[@id='endpoint' and @title='Главная']");
    private final SelenideElement buttonShorts = $x("//a[@id='endpoint' and @title='Shorts']");
    private final SelenideElement buttonSubscribe = $x("//a[@id='endpoint' and @title='Подписки']");

    private final SelenideElement buttonLibrary = $x("//a[@id='endpoint' and @title='Библиотека']");

    public void clickOnSearchField() {
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

    /**
     * I use custom methods which get text from buttons and match with expected result
     * @return
     */
    public String getTextFromButtonMain() {
        buttonMain.shouldBe(Condition.enabled);
        return buttonMain.getText().equals("Главная") ? "Главная" : "Не вернул текст";
    }

    public String getTextFromButtonShorts() {
        buttonShorts.shouldBe(Condition.enabled);
        return buttonShorts.getText().equals("Shorts") ? "Shorts" : "Не вернул текст";
    }

    public String getTextFromButtonSubscribe() {
        buttonSubscribe.shouldBe(Condition.enabled);
        return buttonSubscribe.getText().equals("Подписки") ? "Подписки" : "Не вернул текст";
    }

    public String getTextFromButtonLibrary() {
        buttonLibrary.shouldBe(Condition.enabled);
        return buttonLibrary.getText().equals("Библиотека") ? "Библиотека" : "Не вернул текст";
    }


    }

