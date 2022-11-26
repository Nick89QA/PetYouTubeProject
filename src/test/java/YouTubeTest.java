import org.junit.Test;

public class YouTubeTest extends BaseTest {


    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    AuthorizationPage authorizationPage = new AuthorizationPage();

    /**
     * User go to the main page, enter the text "watch new serials" check first results and choose the serial
     */

    @Test
    public void searchSerialAndGoToPageWithSerial() {
        mainPage.openWebSite(MainPage.BASE_URL);
        mainPage.clickOnSearchField();
        searchPage.goToPageWithSerials();
    }

    /**
     * User authorize
     */
    @Test
    public void userAuthorization() {
        mainPage.openWebSite(MainPage.BASE_URL);
        authorizationPage.userSignIn();

    }

    /**
     * User go to the main page, and change theme on dark and assert that theme is dark
     */
    @Test
    public void userCanChangeThemeOnDark() {
        mainPage.openWebSite(MainPage.BASE_URL);
        mainPage.changeThemeOnDark();
        mainPage.assertThatThemeIsDark();
    }

    @Test
    public void checksButtonsInMenu() {
        mainPage.openWebSite(MainPage.BASE_URL);
        mainPage.methodChecksButtonsInBurgerMenu();

    }

}
