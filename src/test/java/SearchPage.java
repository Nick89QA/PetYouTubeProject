import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final SelenideElement linkHeadOfVideoClip = $x("//*[@href='/watch?v=pTFSPVvbzOs']//*[contains(text(), 'КОМЕДИЯ')]");
    private final SelenideElement assertSearchVideoClip = $x("//*[@href='https://www.youtube.com/channel/UCHwjoSkjCHxsHoV2d1mg_Zw']");
    private final SelenideElement mainPageLogo = $x("//*[@id='logo']//*[@href='/']");

    /**
     * тест переходит на страницу с роликом,убеждается в том что он на нужном канале
     * и переходит на главную страницу
     */
   public void goToPageWithSerials() {
       linkHeadOfVideoClip.shouldHave(Condition.enabled).shouldHave(Condition.text("СВАТЫ")).click();
       assertSearchVideoClip.shouldHave(Condition.enabled);
       mainPageLogo.shouldHave(Condition.enabled).click();


   }



}
