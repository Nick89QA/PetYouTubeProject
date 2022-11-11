import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement searchField = $x("//input[@id='search']");
    private final SelenideElement searchButton = $x("//button[@class='style-scope ytd-searchbox']");
    private final static String SEARCH_STRING = "Смотреть сериал Сваты";
    public static String BASE_URL = "https://www.youtube.com/";


    public void foundSerials() {
        searchField.shouldBe(Condition.enabled).click();
        searchField.shouldHave(Condition.type("text")).setValue(SEARCH_STRING).pressEnter();


    }

    public void openWebSite(String url) {
        Selenide.open(url);
    }

}
