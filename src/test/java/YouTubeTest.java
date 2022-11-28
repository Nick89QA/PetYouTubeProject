import com.google.common.collect.ComparisonChain;
import customAssert.Main;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class YouTubeTest extends BaseTest {


    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    AuthorizationPage authorizationPage = new AuthorizationPage();


    /**
     * User go to the main page, enter the text "watch new serials" check first results and choose the serial
     */

    @Test()

    public void searchSerialAndGoToPageWithSerial() {
        mainPage.openWebSite(MainPage.BASE_URL);
        mainPage.clickOnSearchField();
        searchPage.goToPageWithSerials();
    }

    /**
     * User authorize
     */

    public void userAuthorization() {
        mainPage.openWebSite(MainPage.BASE_URL);
        authorizationPage.userSignIn();

    }

    /**
     * User go to the main page, and change theme on dark and assert that theme is dark is on
     */
    @Test
    public void userCanChangeThemeOnDark() {
        mainPage.openWebSite(MainPage.BASE_URL);
        mainPage.changeThemeOnDark();
        mainPage.assertThatThemeIsDark();
    }

    /**
     * Custom method, which get text from attributes in burger menu and match it, with expected result
     */
    @Test
    public void checkAttributes(){
        mainPage.openWebSite(MainPage.BASE_URL);
        System.out.println(mainPage.getTextFromButtonMain());
        System.out.println(mainPage.getTextFromButtonShorts());
        System.out.println(mainPage.getTextFromButtonSubscribe());
        System.out.println(mainPage.getTextFromButtonLibrary());
    }

    @Test
    public void assertMethod() {
        mainPage.openWebSite(MainPage.BASE_URL);
        Main expectedResult = new Main("Главная","Shorts","Подписки",
                "Библиотека");
        Main actualResult = new Main(mainPage.getTextFromButtonMain(), mainPage.getTextFromButtonShorts(),
                mainPage.getTextFromButtonSubscribe(), mainPage.getTextFromButtonLibrary());
        Assert.assertTrue(EqualsBuilder.reflectionEquals(expectedResult,actualResult));

    }


}
