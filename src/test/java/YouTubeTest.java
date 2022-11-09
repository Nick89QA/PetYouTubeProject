import org.junit.Test;

public class YouTubeTest extends BaseTest {

    private final static String BASE_URL = "https://www.youtube.com/";


    @Test
    public void checkHref() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.clickOnSearchField();
        int i = 44;
    }
}
