package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class NormalIframe_Test extends Hooks {

    @Test
    void testNormalIframe() {

        // Get Home Page and click on WebAutomationLink
        pages.getHomePage().clickOnWebAutomationLink();

        // Click on IframeLink
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnIframeLink();

        // Click on NormalIframeLink
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnNormalIframe();

        // Get the title of NormalIframe
        String actualTitle = pages.getNormalIframePage().getHeaderOfNormalIframe();

        // Verify that you get the correct title
        String expectedTitle = "Inar academy";
        softAssertions.assertThat(expectedTitle).as("since we have a fail it means that the header of the iframe does not match with the expected one.")
                .isEqualTo(actualTitle);

        // Navigate to the page and click on the More information link to navigate more information...
        pages.getNormalIframePage().clickOnMoreInformationLink();

        // Get the url which you've navigated by clicking on the More information link
        String urlOfMoreInfo = pages.getNormalIframePage().getUrlNavigatedByMoreInformationLink();

        // Verify that you get the url which you have been navigated to
        String urlExpected = "https://www.iana.org/help/example-domains";
        softAssertions.assertThat(urlOfMoreInfo).as("This not the correct url").isEqualTo(urlExpected);

        // Report the all failures if it occurs within test
        softAssertions.assertAll();
    }
}