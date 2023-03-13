package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebuniverstyPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;

public class WebuniverstyStepdefinitions {
    WebuniverstyPage webuniverstyPage=new WebuniverstyPage();
    Actions actions=new Actions(Driver.getDriver());
    String ilkSayfaWHD;
    String ikinciSayfaWHD;


    @Then("Login Portal\" a kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        actions.moveToElement(webuniverstyPage.loginPortalElement).perform();

    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        ilkSayfaWHD= Driver.getDriver().getWindowHandle();
        webuniverstyPage.loginPortalElement.click();
    }

    @Then("acilan ikinci window a gecer")
    public void acilan_ikinci_window_a_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
        ikinciSayfaWHD=Driver.getDriver().getWindowHandle();
    }

    @Then("username kutusuna  deger yazdirir")
    public void username_kutusuna_deger_yazdirir() {
        webuniverstyPage.usernameBox.sendKeys(ConfigReader.getProperty("webUniUsername"));
    }


    @Then("password kutusuna  deger yazdirir")
    public void password_kutusuna_deger_yazdirir() {
        webuniverstyPage.passwordBox.sendKeys(ConfigReader.getProperty("webUniPassword"));

    }

    @Then("webuniversty login butonuna basar")
    public void webuniversty_login_butonuna_basar() {
        webuniverstyPage.loginButton.click();
    }



    @Then("Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        String expectedAlertYazi="validation failed";
        String actualAlertYazi= Driver.getDriver().switchTo().alert().getText();

        Assert.assertEquals(expectedAlertYazi,actualAlertYazi);
    }
    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        Driver.getDriver().switchTo().window(ilkSayfaWHD);
    }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilk_sayfaya_donuldugunu_test_eder() {

        Assert.assertTrue(webuniverstyPage.loginPortalElement.isDisplayed());
    }

    @Then("tum sayfayi kapatir")
    public void tum_sayfayi_kapatir() {
        Driver.quitDriver();
    }







}
