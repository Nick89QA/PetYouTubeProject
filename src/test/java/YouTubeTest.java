import org.junit.Test;

public class YouTubeTest extends BaseTest {

    private final static String BASE_URL = "https://www.youtube.com/";



    @Test
    public void searchSerialAndGoToPageWithSerial() {
        MainPage mainPage = new MainPage();
        SearchPage searchPage = new SearchPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.foundSerials();
        searchPage.goToPageWithSerials();
        int i = 33;
    }
}
