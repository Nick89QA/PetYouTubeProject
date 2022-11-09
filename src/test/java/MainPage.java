import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final static String SEARCH_STRING = "Смотреть сериалы";
    private final SelenideElement searchField = $x("//div[@id='search-input']");
    private final SelenideElement searchButton = $x("//button[@class='style-scope ytd-searchbox']");



    public void clickOnSearch() {
        searchField.click();
    }
}
