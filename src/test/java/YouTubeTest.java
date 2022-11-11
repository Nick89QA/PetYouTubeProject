import org.junit.Test;

public class YouTubeTest extends BaseTest {


    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    AuthorizationPage authorizationPage = new AuthorizationPage();


    @Test
    public void searchSerialAndGoToPageWithSerial() {
        mainPage.openWebSite(MainPage.BASE_URL);
        mainPage.foundSerials();
        searchPage.goToPageWithSerials();
    }

    @Test
    public void userAuthorization() {
        mainPage.openWebSite(MainPage.BASE_URL);
        authorizationPage.userSignIn();
    }

}
