import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final SelenideElement HeadOfVideoClip = $x("//*[@href='/watch?v=pTFSPVvbzOs']//*[contains(text(), 'КОМЕДИЯ')]");


   public void goToPageWithSerials() {
       HeadOfVideoClip.shouldHave(Condition.enabled).shouldHave(Condition.text("СВАТЫ")).click();
   }



}
