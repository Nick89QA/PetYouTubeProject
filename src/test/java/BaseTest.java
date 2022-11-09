import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

abstract public class BaseTest {

    /**
     * метод setUp настраивает, конфигурирует браузер и уста
     */
    public void SetUp() {
        WebDriverManager.chromedriver().setup();//качаем устанавливаем драйвер
        Configuration.browser = "chrome";//браузер хром
        Configuration.driverManagerEnabled = true;//подтверждение для драйвер менеджера
        Configuration.browserSize = "1720x1080";//указываем размер окна
        Configuration.headless = false;//отображение прогона тестов в консоли

    }

    @Before
    public void init() {
        SetUp();//вызвали метод
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver(); //закрыли
    }
}
