import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final SelenideElement headOfVideoClip = $x("//*[@href='/watch?v=pTFSPVvbzOs']//*[contains(text(), 'КОМЕДИЯ')]");
    private final SelenideElement assertSearchVideoClip = $x("//*[@href='https://www.youtube.com/channel/UCHwjoSkjCHxsHoV2d1mg_Zw']");

   public void goToPageWithSerials() {
       headOfVideoClip.shouldHave(Condition.enabled).shouldHave(Condition.text("СВАТЫ")).click();
       assertSearchVideoClip.shouldHave(Condition.enabled);

   }



}
