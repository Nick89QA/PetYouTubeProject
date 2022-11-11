import org.junit.Test;

public class YouTubeTest extends BaseTest {

    private final static String BASE_URL = "https://www.youtube.com/";

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();


    @Test
    public void searchSerialAndGoToPageWithSerial() {
        mainPage.openWebSite(BASE_URL);
        mainPage.foundSerials();
        searchPage.goToPageWithSerials();
        int i = 33;
    }
}
