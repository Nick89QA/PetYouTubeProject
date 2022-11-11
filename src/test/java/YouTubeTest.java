import org.junit.Test;

public class YouTubeTest extends BaseTest {

    private final static String BASE_URL = "https://www.youtube.com/";

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    AuthorizationPage authorizationPage = new AuthorizationPage();


    @Test
    public void searchSerialAndGoToPageWithSerial() {
        mainPage.openWebSite(BASE_URL);
        mainPage.foundSerials();
        searchPage.goToPageWithSerials();
    }

    @Test
    public void userAuthorization() {
     mainPage.openWebSite(BASE_URL);
    authorizationPage.userSignIn();
    }

}
